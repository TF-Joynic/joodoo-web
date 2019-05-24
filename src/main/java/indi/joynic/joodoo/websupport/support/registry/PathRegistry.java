package indi.joynic.joodoo.websupport.support.registry;

import indi.joynic.joodoo.websupport.support.Action;
import indi.joynic.joodoo.websupport.support.RequestPath;

public interface PathRegistry {
    void register(RequestPath requestPath, Action action);

    void unregister(RequestPath requestPath, Action action);

    void clear();
}