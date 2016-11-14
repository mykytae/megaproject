package com.megaproject.service.historyImpl;

import com.megaproject.dao.HistoryDao;
import com.megaproject.entity.History;
import com.megaproject.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by nik on 14.11.2016.
 */
@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    HistoryDao historyDao;

    @Override
    @Transactional
    public History create(History history) {
        History createdHistory = history;
        return historyDao.save(createdHistory);
    }

    @Override
    @Transactional
    public List<History> findByUserId(int userId) {
        return historyDao.findByUserId(userId);
    }

    @Override
    @Transactional
    public List<History> findByBankAccount(String bankAccount) {
        return historyDao.findByBankAccount(bankAccount);
    }
}
