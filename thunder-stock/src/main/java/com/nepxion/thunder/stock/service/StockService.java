package com.nepxion.thunder.stock.service;

/**
 * <p>Title: Nepxion Stock</p>
 * <p>Description: Nepxion Stock For Distribution</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.util.List;

import com.nepxion.thunder.stock.entity.Stock;
import com.nepxion.thunder.stock.entity.StockType;

public interface StockService {
    List<Stock> execute(String[] codes, StockType stockType, boolean simple);
}