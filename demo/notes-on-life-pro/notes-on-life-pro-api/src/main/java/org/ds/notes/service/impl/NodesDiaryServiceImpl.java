package org.ds.notes.service.impl;

import org.ds.notes.dao.NodesDiaryReposiroty;
import org.ds.notes.entity.NodesDiary;
import org.ds.notes.service.NodesDiaryService;
import org.ds.notes.vo.NodesDiaryVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xingbm on 2021/1/2 15:47
 */
@Service
public class NodesDiaryServiceImpl implements NodesDiaryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NodesDiaryServiceImpl.class);

    @Resource
    private NodesDiaryReposiroty nodesDiaryReposiroty;

    @Override
    public void insert(NodesDiaryVO nodesDiaryVO) {
        NodesDiary nodesDiary = new NodesDiary();
        BeanUtils.copyProperties(nodesDiaryVO, nodesDiary);
        nodesDiaryReposiroty.save(nodesDiary);
    }

    @Override
    public List<NodesDiaryVO> list() {
        List<NodesDiaryVO> nodesDiaryVOList = new ArrayList<>();
        List<NodesDiary> nodesDiaryList = nodesDiaryReposiroty.findAll();
        nodesDiaryList.forEach(nodesDiary -> {
            NodesDiaryVO nodesDiaryVO = new NodesDiaryVO();
            nodesDiaryVO.setId(nodesDiary.getId());
            nodesDiaryVO.setDiaryDate(nodesDiary.getDiaryDate());
            nodesDiaryVO.setDiaryTimeBegin(nodesDiary.getDiaryTimeBegin());
            nodesDiaryVO.setDiaryTimeEnd(nodesDiary.getDiaryTimeEnd());
            nodesDiaryVO.setDiaryType(nodesDiary.getDiaryType());
            nodesDiaryVO.setDiaryContent(nodesDiary.getDiaryContent());
            nodesDiaryVOList.add(nodesDiaryVO);
        });
        return nodesDiaryVOList;
    }

}
