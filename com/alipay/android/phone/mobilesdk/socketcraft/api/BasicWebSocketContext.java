package com.alipay.android.phone.mobilesdk.socketcraft.api;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BasicWebSocketContext implements WebSocketContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WebSocketContext f5101a;
    private Map b;

    public BasicWebSocketContext() {
        this(null);
    }

    public BasicWebSocketContext(WebSocketContext webSocketContext) {
        this.b = null;
        this.f5101a = webSocketContext;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketContext
    public Object getAttribute(String str) {
        WebSocketContext webSocketContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("60511e1b", new Object[]{this, str});
        }
        if (str == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        Object obj = null;
        Map map = this.b;
        if (map != null) {
            obj = map.get(str);
        }
        return (obj != null || (webSocketContext = this.f5101a) == null) ? obj : webSocketContext.getAttribute(str);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketContext
    public void setAttribute(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd20287", new Object[]{this, str, obj});
        } else if (str == null) {
            throw new IllegalArgumentException("Id may not be null");
        } else {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(str, obj);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketContext
    public Object removeAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d7e3349", new Object[]{this, str});
        }
        if (str == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        Map map = this.b;
        if (map == null) {
            return null;
        }
        return map.remove(str);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketContext
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        Map map = this.b;
        if (map != null) {
            map.clear();
        }
        WebSocketContext webSocketContext = this.f5101a;
        if (webSocketContext == null) {
            return;
        }
        webSocketContext.clear();
    }
}
