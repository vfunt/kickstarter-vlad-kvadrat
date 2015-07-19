package com.morkva.services.impl;

import com.morkva.entities.PaymentStatus;
import com.morkva.model.dao.PaymentStatusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("paymentStatusService")
public class PaymentStatusServiceImpl {

    @Autowired
    private PaymentStatusDao paymentStatusDao;

    public PaymentStatus getById(Integer id) {
        return paymentStatusDao.getById(id);
    }
}