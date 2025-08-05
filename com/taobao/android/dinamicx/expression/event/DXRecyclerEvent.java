package com.taobao.android.dinamicx.expression.event;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class DXRecyclerEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int deltaX;
    public int deltaY;
    public int offsetX;
    public int offsetY;
    public DXWidgetNode selfWidget;
    public double speedRatio;
    public String userId;

    static {
        kge.a(-1720209522);
    }

    public DXRecyclerEvent(long j) {
        super(j);
    }

    public double getSpeedRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e7c236f", new Object[]{this})).doubleValue() : this.speedRatio;
    }

    public void setSpeedRatio(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87df4651", new Object[]{this, new Double(d)});
        } else {
            this.speedRatio = d;
        }
    }

    public int getDeltaY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fc43f91", new Object[]{this})).intValue() : this.deltaY;
    }

    public void setDeltaY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f299a99", new Object[]{this, new Integer(i)});
        } else {
            this.deltaY = i;
        }
    }

    public int getDeltaX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fb62810", new Object[]{this})).intValue() : this.deltaX;
    }

    public void setDeltaX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d74c1fa", new Object[]{this, new Integer(i)});
        } else {
            this.deltaX = i;
        }
    }

    public int getOffsetY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2571766a", new Object[]{this})).intValue() : this.offsetY;
    }

    public void setOffsetY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf06c678", new Object[]{this, new Integer(i)});
        } else {
            this.offsetY = i;
        }
    }

    public int getOffsetX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25635ee9", new Object[]{this})).intValue() : this.offsetX;
    }

    public void setOffsetX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd51edd9", new Object[]{this, new Integer(i)});
        } else {
            this.offsetX = i;
        }
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.userId;
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }

    public DXWidgetNode getSelfWidget() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("5ca3b54c", new Object[]{this}) : this.selfWidget;
    }

    public void setSelfWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c68d216", new Object[]{this, dXWidgetNode});
        } else {
            this.selfWidget = dXWidgetNode;
        }
    }

    public void setDataToArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea25acb", new Object[]{this});
        } else {
            setDataToArgs(null);
        }
    }

    public void setDataToArgs(Map<String, f> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81b315a", new Object[]{this, map});
            return;
        }
        Map<String, f> args = getArgs();
        if (args == null) {
            args = new HashMap<>();
        }
        if (map != null && !map.isEmpty()) {
            args.putAll(map);
        }
        args.put("deltaY", f.a(this.deltaY));
        args.put("deltaX", f.a(this.deltaX));
        args.put("offsetX", f.a(this.offsetX));
        args.put("offsetY", f.a(this.offsetY));
        if (!TextUtils.isEmpty(this.userId)) {
            args.put("userId", f.a(this.userId));
        }
        args.put("direction", f.a(this.deltaY > 0 ? "up" : "down"));
        DXWidgetNode dXWidgetNode = this.selfWidget;
        if (dXWidgetNode != null) {
            args.put("selfWidget", f.a(dXWidgetNode));
        }
        setArgs(args);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXRecyclerEvent{, deltaY=" + this.deltaY + ", deltaX=" + this.deltaX + ", offsetY=" + this.offsetY + ", offsetX=" + this.offsetX + ", userId='" + this.userId + "', selfWidget=" + this.selfWidget + '}';
    }
}
