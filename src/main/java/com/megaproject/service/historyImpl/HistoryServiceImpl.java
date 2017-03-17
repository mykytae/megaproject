package com.megaproject.service.historyImpl;

import com.megaproject.dao.HistoryDao;
import com.megaproject.entity.History;
import com.megaproject.service.HistoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Resource
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
    public List<History> findByBankAccountId(int bankAccountId) {
        return historyDao.findByBankAccountId(bankAccountId);
    }

    @Override
    public String generateDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
