package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<TopAtmosphereMessage.TopAtmosphereMessageType, a> f13672a;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public i f13673a;
        public TopAtmosphereMessage b;

        static {
            kge.a(1558216675);
        }

        public a(i iVar) {
            this.f13673a = iVar;
        }
    }

    static {
        kge.a(-1296305645);
    }

    public void a(TopAtmosphereMessage topAtmosphereMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5985932", new Object[]{this, topAtmosphereMessage});
        } else if (topAtmosphereMessage == null || topAtmosphereMessage.data == null) {
        } else {
            if (topAtmosphereMessage.data.pushTime <= 0) {
                topAtmosphereMessage.data.pushTime = System.currentTimeMillis();
            }
            a aVar = this.f13672a.get(topAtmosphereMessage.getMessageType());
            if (aVar == null) {
                return;
            }
            if (!b()) {
                aVar.f13673a.a(topAtmosphereMessage);
            } else {
                aVar.b = topAtmosphereMessage;
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (a aVar : this.f13672a.values()) {
            if (aVar.f13673a.a()) {
                aVar.f13673a.b();
                return;
            }
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        for (a aVar : this.f13672a.values()) {
            if (aVar.f13673a.a()) {
                return true;
            }
        }
        return false;
    }
}
