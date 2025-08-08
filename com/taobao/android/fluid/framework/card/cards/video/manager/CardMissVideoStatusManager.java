package com.taobao.android.fluid.framework.card.cards.video.manager;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;
import tb.sii;
import tb.son;
import tb.spz;

/* loaded from: classes5.dex */
public class CardMissVideoStatusManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final sii f12494a;
    private String b;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface CardMissVideoStatus {
    }

    static {
        kge.a(2127564036);
    }

    public CardMissVideoStatusManager(sii siiVar) {
        this.f12494a = siiVar;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!son.k()) {
            return false;
        }
        if (!StringUtils.isEmpty(this.b) && this.b.contains(str)) {
            spz.c("CardMissVideoStatusManager", "卡片消失，" + str + "已经调用过，不重复调用");
            return true;
        }
        b(str);
        return false;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.f12494a.o().b) {
            return false;
        }
        return this.f12494a.aa().h() <= 0 || Math.round((((float) this.f12494a.aa().c()) * 100.0f) / ((float) this.f12494a.aa().h())) <= 95;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            spz.c("CardMissVideoStatusManager", "卡片消失，mCardMissVideoStatusStr已经清空");
            this.b = null;
        } else {
            this.b += "," + str;
        }
    }
}
