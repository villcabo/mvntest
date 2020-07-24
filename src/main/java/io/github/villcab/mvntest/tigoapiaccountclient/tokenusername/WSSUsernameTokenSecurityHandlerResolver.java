package io.github.villcab.mvntest.tigoapiaccountclient.tokenusername;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

public class WSSUsernameTokenSecurityHandlerResolver implements HandlerResolver {

    @Override
    public List<Handler> getHandlerChain(PortInfo arg0) {
        List<Handler> hchain = new ArrayList<>();
        hchain.add(new WSSUsernameTokenSecurityHandler());
        hchain.add(new JaxWsLoggingHandler());
        return hchain;
    }
}
