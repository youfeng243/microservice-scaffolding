package com.fcbox.beedance.service.service;

import com.fcbox.beedance.service.domain.command.DemoCommand;
import com.fcbox.beedance.service.domain.dto.DemoDTO;

/**
 * @author 無痕剑
 * @date 2018/11/5 23:15
 */
public interface DemoService {

	void demo(DemoCommand command);

	DemoDTO demo(String demo);
}
