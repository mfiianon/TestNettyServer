package com.xing.netty.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;

public class TestOut2Handler extends ChannelOutboundHandlerAdapter {

	@Override
	public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
		super.handlerAdded(ctx);
		System.out.println("TestOut2Handler handlerAdded");
	}

	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
		super.handlerRemoved(ctx);
		System.out.println("TestOut2Handler handlerRemoved");
	}

}
