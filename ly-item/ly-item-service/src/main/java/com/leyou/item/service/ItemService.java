package com.leyou.item.service;

import com.leyou.item.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @ Author     : dqf
 * @ Date       : Create in 23:56 2019-05-28
 * @ Modified By: xxx
 */
@Service
public class ItemService {
    public Item saveItem(Item item) {
        int id = new Random().nextInt(100);
        item.setId(id);
        return item;
    }
}
