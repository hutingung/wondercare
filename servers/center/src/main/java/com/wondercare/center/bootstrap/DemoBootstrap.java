package com.wondercare.center.bootstrap;

import com.wondercare.center.data.entity.Center;
import com.wondercare.center.data.entity.CenterType;
import com.wondercare.center.data.entity.Contact;
import com.wondercare.center.data.repository.CenterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoBootstrap implements ApplicationRunner {

    @Autowired
    private CenterRepository centerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Running demo bootstrap");
        Center.CenterBuilder centerBuilder = Center.builder();
        centerBuilder.name("Kids Cove");
        centerBuilder.businessId("demoid");
        centerBuilder.type(CenterType.HOME);
        centerRepository.save(centerBuilder.build());
    }
}
