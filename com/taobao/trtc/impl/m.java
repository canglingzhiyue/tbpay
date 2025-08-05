package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes9.dex */
public class m implements com.taobao.trtc.api.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TrtcEngineImpl f23149a;
    private final TrtcInnerDefines.TrtcVideoLayoutParams b = new TrtcInnerDefines.TrtcVideoLayoutParams();

    static {
        kge.a(2147328152);
        kge.a(555195443);
    }

    public m(TrtcEngineImpl trtcEngineImpl) {
        this.f23149a = trtcEngineImpl;
        this.b.backgroundInfo = new TrtcInnerDefines.TrtcVideoLayoutBackground();
        this.b.rects = new ArrayList<>();
    }

    public static String a(TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6765d550", new Object[]{trtcVideoLayoutParams});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{ sub video size: ");
        sb.append(trtcVideoLayoutParams.subWidth);
        sb.append("x");
        sb.append(trtcVideoLayoutParams.subHeight);
        sb.append(" | background type: ");
        if (trtcVideoLayoutParams.backgroundInfo.bType == 0) {
            sb.append("color, rgb: ");
            sb.append(trtcVideoLayoutParams.backgroundInfo.bR);
            sb.append("-");
            sb.append(trtcVideoLayoutParams.backgroundInfo.bG);
            sb.append("-");
            sb.append(trtcVideoLayoutParams.backgroundInfo.bB);
        } else {
            sb.append("image, type: ");
            sb.append(trtcVideoLayoutParams.backgroundInfo.bImageType == 0 ? "local" : "server");
            sb.append(", url: ");
            sb.append(trtcVideoLayoutParams.backgroundInfo.bImageUrl);
        }
        sb.append(", background size: ");
        sb.append(trtcVideoLayoutParams.backgroundInfo.bWidth);
        sb.append("x");
        sb.append(trtcVideoLayoutParams.backgroundInfo.bHeight);
        sb.append(", vect list: |");
        Iterator<TrtcInnerDefines.TrtcVideoLayoutRect> it = trtcVideoLayoutParams.rects.iterator();
        while (it.hasNext()) {
            TrtcInnerDefines.TrtcVideoLayoutRect next = it.next();
            sb.append("userId: ");
            sb.append(next.userId);
            sb.append(", ");
            sb.append(next.xPos);
            sb.append("-");
            sb.append(next.yPos);
            sb.append("-");
            sb.append(next.zPos);
            sb.append(" ");
            sb.append(next.width);
            sb.append("x");
            sb.append(next.height);
            sb.append(" | ");
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // com.taobao.trtc.api.d
    public com.taobao.trtc.api.d a(int i, int i2, int i3, int i4, int i5, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.api.d) ipChange.ipc$dispatch("44034d6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), str});
        }
        if (str.isEmpty() || i4 == 0 || i5 == 0) {
            TrtcLog.a("TrtcVideoLayoutImpl", "set rect error for var invalid");
            z = false;
        }
        Iterator<TrtcInnerDefines.TrtcVideoLayoutRect> it = this.b.rects.iterator();
        while (it.hasNext()) {
            if (it.next().userId.equals(str)) {
                TrtcLog.a("TrtcVideoLayoutImpl", "set rect error for: uid: " + str + " rect exist");
                z = false;
            }
        }
        if (z) {
            TrtcInnerDefines.TrtcVideoLayoutRect trtcVideoLayoutRect = new TrtcInnerDefines.TrtcVideoLayoutRect();
            trtcVideoLayoutRect.xPos = i;
            trtcVideoLayoutRect.yPos = i2;
            trtcVideoLayoutRect.zPos = i3;
            trtcVideoLayoutRect.width = i4;
            trtcVideoLayoutRect.height = i5;
            trtcVideoLayoutRect.userId = str;
            this.b.rects.add(trtcVideoLayoutRect);
        }
        return this;
    }

    @Override // com.taobao.trtc.api.d
    public com.taobao.trtc.api.d a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.api.d) ipChange.ipc$dispatch("992f2b79", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i != 0 && i2 != 0) {
            this.b.backgroundInfo.bWidth = i;
            this.b.backgroundInfo.bHeight = i2;
        }
        return this;
    }

    @Override // com.taobao.trtc.api.d
    public com.taobao.trtc.api.d a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.api.d) ipChange.ipc$dispatch("5e3ea9ac", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        this.b.backgroundInfo.bType = 0;
        this.b.backgroundInfo.bR = i;
        this.b.backgroundInfo.bG = i2;
        this.b.backgroundInfo.bB = i3;
        return this;
    }

    @Override // com.taobao.trtc.api.d
    public com.taobao.trtc.api.d a(TrtcDefines.TrtcBackgroundImageType trtcBackgroundImageType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.api.d) ipChange.ipc$dispatch("c5901e97", new Object[]{this, trtcBackgroundImageType, str});
        }
        this.b.backgroundInfo.bType = 1;
        this.b.backgroundInfo.bImageType = trtcBackgroundImageType.ordinal();
        TrtcInnerDefines.TrtcVideoLayoutBackground trtcVideoLayoutBackground = this.b.backgroundInfo;
        if (str == null) {
            str = "";
        }
        trtcVideoLayoutBackground.bImageUrl = str;
        return this;
    }

    @Override // com.taobao.trtc.api.d
    public com.taobao.trtc.api.d a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.api.d) ipChange.ipc$dispatch("670bc0c", new Object[]{this, new Integer(i)});
        }
        this.b.backgroundInfo.bType = i;
        if (this.b.backgroundInfo.bImageUrl == null || (this.b.backgroundInfo.bImageUrl != null && this.b.backgroundInfo.bImageUrl.isEmpty())) {
            this.b.backgroundInfo.bType = 0;
        }
        return this;
    }

    @Override // com.taobao.trtc.api.d
    public com.taobao.trtc.api.d b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.api.d) ipChange.ipc$dispatch("c27f0ffa", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams = this.b;
        trtcVideoLayoutParams.subWidth = i;
        trtcVideoLayoutParams.subHeight = i2;
        return this;
    }

    @Override // com.taobao.trtc.api.d
    public com.taobao.trtc.api.d a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.api.d) ipChange.ipc$dispatch("805cd963", new Object[]{this, str});
        }
        this.b.extension = str;
        return this;
    }

    @Override // com.taobao.trtc.api.d
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.b.rects.isEmpty()) {
            TrtcLog.a("TrtcVideoLayoutImpl", "set video layout error for rect is empty");
            return false;
        }
        return this.f23149a.a(this.b);
    }
}
