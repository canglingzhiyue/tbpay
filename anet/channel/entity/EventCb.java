package anet.channel.entity;

import anet.channel.Session;

/* loaded from: classes.dex */
public interface EventCb {
    void onEvent(Session session, int i, Event event);
}
