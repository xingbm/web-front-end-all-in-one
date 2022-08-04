package org.ds.notes.service;

import org.ds.notes.vo.NodesDiaryVO;

import java.util.List;

/**
 * Created by xingbm on 2021/1/2 15:47
 */
public interface NodesDiaryService {

    void insert(NodesDiaryVO nodesDiaryVO);

    List<NodesDiaryVO> list();

}
