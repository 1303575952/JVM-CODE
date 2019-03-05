package nia.chapter6;

import io.netty.channel.*;

/**
 * @author FELIX
 * <p>
 * Listing 6.14 Adding a ChannelFutureListener to a ChannelPromise
 */
public class OutboundExceptionHandler extends ChannelOutboundHandlerAdapter {
    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) {
        promise.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture f) {
                if (!f.isSuccess()) {
                    f.cause().printStackTrace();
                    f.channel().close();
                }
            }
        });
    }
}
