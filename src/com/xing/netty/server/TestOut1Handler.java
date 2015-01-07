package com.xing.netty.server;

import java.net.SocketAddress;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

public class TestOut1Handler extends ChannelOutboundHandlerAdapter {

	@Override
	public void close(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
		super.close(ctx, promise);
		System.out.println("TestOut1Handler close");
		ctx.close();
	}
	
	@Override
	public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
		super.write(ctx, msg, promise);
		System.out.println("TestOut1Handler write");
		ctx.write(msg, promise);
	}

	@Override
	public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
		super.handlerAdded(ctx);
		System.out.println("TestOut1Handler handlerAdded");
	}

	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
		super.handlerRemoved(ctx);
		System.out.println("TestOut1Handler handlerRemoved");
	}

	@Override
	public void flush(ChannelHandlerContext ctx) throws Exception {
		super.flush(ctx);
		System.out.println("TestOut1Handler flush");
	}

	@Override
	public void bind(ChannelHandlerContext ctx, SocketAddress localAddress, ChannelPromise promise) throws Exception {
		super.bind(ctx, localAddress, promise);
		System.out.println("TestOut1Handler bind");
	}

	@Override
	public void connect(ChannelHandlerContext ctx, SocketAddress remoteAddress, SocketAddress localAddress,
			ChannelPromise promise) throws Exception {
		super.connect(ctx, remoteAddress, localAddress, promise);
		System.out.println("TestOut1Handler connect");
	}

	@Override
	public void deregister(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
		super.deregister(ctx, promise);
		System.out.println("TestOut1Handler deregister");
	}

	@Override
	public void disconnect(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
		super.disconnect(ctx, promise);
		System.out.println("TestOut1Handler disconnect");
	}

	@Override
	public void read(ChannelHandlerContext ctx) throws Exception {
		super.read(ctx);
		System.out.println("TestOut1Handler read");
		ctx.read();
	}

}
