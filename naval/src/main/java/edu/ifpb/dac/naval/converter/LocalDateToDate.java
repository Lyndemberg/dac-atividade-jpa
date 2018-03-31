/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.dac.naval.converter;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author lyndemberg
 */
@Converter(autoApply = true)
public class LocalDateToDate implements AttributeConverter<LocalDate, Date>{

    @Override
    public Date convertToDatabaseColumn(LocalDate attribute) {
        if(attribute == null){
            return null;
        }else{
            return Date.valueOf(attribute);
        }   
    }

    @Override
    public LocalDate convertToEntityAttribute(Date dbData) {
        if(dbData == null){
            return null;
        }else{
            return dbData.toLocalDate();
        }
    }
    
}
