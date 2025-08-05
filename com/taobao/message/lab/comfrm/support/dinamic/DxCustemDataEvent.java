package com.taobao.message.lab.comfrm.support.dinamic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/taobao/message/lab/comfrm/support/dinamic/DxCustemDataEvent;", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "eventId", "", "(J)V", "context", "", "", "", "getContext", "()Ljava/util/Map;", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "put", "", "key", "value", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class DxCustemDataEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Object> context;
    private String name;

    static {
        kge.a(-1395821713);
    }

    public DxCustemDataEvent(long j) {
        super(j);
        this.context = new LinkedHashMap();
        this.name = null;
    }

    public final Map<String, Object> getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7ab803b5", new Object[]{this}) : this.context;
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public final void put(String key, Object value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97b403c", new Object[]{this, key, value});
            return;
        }
        q.d(key, "key");
        q.d(value, "value");
        this.context.put(key, value);
    }
}
