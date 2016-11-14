package com.megaproject.service;

import com.megaproject.entity.History;

import java.util.List;

/**
 * Created by nik on 14.11.2016.
 */
public interface HistoryService {
    public History create(History history);
    public List<History> findByUserId(int userId);
    public List<History> findByBankAccount(String bankAccount);
}
