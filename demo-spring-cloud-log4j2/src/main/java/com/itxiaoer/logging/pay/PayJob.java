package com.itxiaoer.logging.pay;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : liuyk
 */
@Slf4j
@Component
public class PayJob {

    /**
     * 2秒钟执行1次
     */
    @Scheduled(fixedRate = 5 * 1000)
    public void logging() {
        DigestUtils.md5Digest()
        String now = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(LocalDateTime.now());
        log.info(now);
        log.debug(now);
        log.error(now);
    }
}
