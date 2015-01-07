package com.xing.netty.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TimeServer2Handler extends SimpleChannelInboundHandler<Object> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object message) throws Exception {
//		System.out.println("TimeServer2Handler channelRead0");
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		super.channelActive(ctx);
		System.out.println("TimeServer2Handler channelActive");
	}

	@Override
	public void channelRead(ChannelHandlerContext arg0, Object arg1) throws Exception {
		super.channelRead(arg0, arg1);
		System.out.println("TimeServer2Handler channelRead");
	}

	@Override
	public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
		super.handlerAdded(ctx);
		System.out.println("TimeServer2Handler handlerAdded");
	}

	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
		super.handlerRemoved(ctx);
		System.out.println("TimeServer2Handler handlerRemoved");
	}

}
