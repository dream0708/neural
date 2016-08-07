package cn.ms.neural.moduler.extension.echosound.processor;

import cn.ms.neural.IProcessor;
import cn.ms.neural.common.exception.EchoSoundException;

/**
 * 回声探测
 * @author lry
 * @version v1.0
 */
public interface IEchoSoundProcessor<REQ, RES> extends IProcessor<REQ, RES> {

	/**
	 * 发射探测
	 * 
	 * @param req
	 * @param args
	 * @return
	 * @throws EchoSoundException
	 */
	REQ $echo(REQ req, Object...args) throws EchoSoundException;
	
	/**
	 * 探测反弹
	 * 
	 * @param req
	 * @param args
	 * @return
	 * @throws EchoSoundException
	 */
	RES $rebound(REQ req, Object...args) throws EchoSoundException;
	
}
