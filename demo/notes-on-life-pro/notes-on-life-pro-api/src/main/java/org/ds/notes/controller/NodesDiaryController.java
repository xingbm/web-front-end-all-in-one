package org.ds.notes.controller;

import org.ds.notes.service.NodesDiaryService;
import org.ds.notes.vo.NodesDiaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xingbm on 2021/1/2 15:45
 */
@RequestMapping("/nodesDiary")
@RestController
public class NodesDiaryController {

    @Autowired
    private NodesDiaryService nodesDiaryService;

    @PostMapping("/insert")
    @ResponseBody
    public Map<String, Object> insert(@RequestBody NodesDiaryVO nodesDiaryVO) {
        nodesDiaryService.insert(nodesDiaryVO);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("data", "");
        return map;
    }

    @GetMapping("/list")
    @ResponseBody
    public Map<String, Object> list() {
        List<NodesDiaryVO> nodesDiaryVOList = nodesDiaryService.list();
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("data", nodesDiaryVOList);
        return map;
    }

}
