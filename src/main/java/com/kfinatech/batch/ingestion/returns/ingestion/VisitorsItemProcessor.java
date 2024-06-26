package com.kfinatech.batch.ingestion.returns.ingestion;

import com.kfinatech.batch.ingestion.returns.data.Visitors;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class VisitorsItemProcessor implements ItemProcessor<Visitors, Visitors> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm");

    @Override
    public Visitors process(Visitors item) throws Exception {
        item.setVisitDate(dateFormat.parse(item.getStrVisitDate()));
        return item;
    }
}