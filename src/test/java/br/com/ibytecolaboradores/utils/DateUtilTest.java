package br.com.ibytecolaboradores.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

class DateUtilTest {

    private DateUtil dateUtil;

    @Autowired
    private ObjectUtil objectUtil;

    @BeforeEach
    public void setUp() {
        /*============================Montagem do Cenario=============================*/
        dateUtil = new DateUtil();
    }

    @AfterEach
    public void tearDown() {
        /*executa no final da execução do teste*/
        objectUtil.clearObject(objectUtil);
    }
}