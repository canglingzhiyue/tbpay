package com.taobao.themis.utils;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.Pair;
import tb.kge;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u0002H\u0006H\u0002¢\u0006\u0002\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\u0013\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u0002H\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00130\u0016¢\u0006\u0002\u0010\u0017\u001a \u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007\u001a \u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019*\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"2\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u0002H\u00062\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\"2\u0010\f\u001a\u00020\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u0002H\u00062\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u001d"}, d2 = {"VIEW_TRIGGER_DELAY_TIME_KEY", "", "VIEW_TRIGGER_LAST_TIME_KEY", "value", "", "triggerDelay", "T", "Landroid/view/View;", "getTriggerDelay", "(Landroid/view/View;)J", "setTriggerDelay", "(Landroid/view/View;J)V", "triggerLastTime", "getTriggerLastTime", "setTriggerLastTime", "clickEnable", "", "(Landroid/view/View;)Z", "clickWithTrigger", "", "time", com.taobao.android.weex_framework.util.a.ATOM_EXT_block, "Lkotlin/Function1;", "(Landroid/view/View;JLkotlin/jvm/functions/Function1;)V", "getRelativePositionToParent", "Lkotlin/Pair;", "parentView", "getRelativePositionToTargetView", com.alibaba.android.ultron.event.base.f.KEY_TARGET_VIEW, "themis_utils_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "Landroid/view/View;", AdvanceSetting.NETWORK_TYPE, "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22890a;
        public final /* synthetic */ rul b;

        public a(View view, rul rulVar) {
            this.f22890a = view;
            this.b = rulVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!p.a(this.f22890a)) {
            } else {
                rul rulVar = this.b;
                if (view == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T");
                }
                rulVar.mo2421invoke(view);
            }
        }
    }

    static {
        kge.a(1442081311);
    }

    public static final /* synthetic */ boolean a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{view})).booleanValue() : d(view);
    }

    public static /* synthetic */ void a(View view, long j, rul rulVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fe949e", new Object[]{view, new Long(j), rulVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            j = 800;
        }
        a(view, j, rulVar);
    }

    public static final <T extends View> void a(T clickWithTrigger, long j, rul<? super T, kotlin.t> block) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db187de1", new Object[]{clickWithTrigger, new Long(j), block});
            return;
        }
        kotlin.jvm.internal.q.d(clickWithTrigger, "$this$clickWithTrigger");
        kotlin.jvm.internal.q.d(block, "block");
        b(clickWithTrigger, j);
        clickWithTrigger.setOnClickListener(new a(clickWithTrigger, block));
    }

    private static final <T extends View> long b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9103723d", new Object[]{t})).longValue();
        }
        Object tag = t.getTag(612345421);
        if (!(tag instanceof Long)) {
            tag = null;
        }
        Long l = (Long) tag;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    private static final <T extends View> void a(T t, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b009a", new Object[]{t, new Long(j)});
        } else {
            t.setTag(612345421, Long.valueOf(j));
        }
    }

    private static final <T extends View> long c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d05011c", new Object[]{t})).longValue();
        }
        Object tag = t.getTag(612345420);
        if (!(tag instanceof Long)) {
            tag = null;
        }
        Long l = (Long) tag;
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    private static final <T extends View> void b(T t, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6b4d9b", new Object[]{t, new Long(j)});
        } else {
            t.setTag(612345420, Long.valueOf(j));
        }
    }

    private static final <T extends View> boolean d(T t) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8906900b", new Object[]{t})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b(t) >= c(t)) {
            z = true;
        }
        a(t, currentTimeMillis);
        return z;
    }

    public static final Pair<Integer, Integer> a(View getRelativePositionToTargetView, View targetView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a6e55e11", new Object[]{getRelativePositionToTargetView, targetView});
        }
        kotlin.jvm.internal.q.d(getRelativePositionToTargetView, "$this$getRelativePositionToTargetView");
        kotlin.jvm.internal.q.d(targetView, "targetView");
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            getRelativePositionToTargetView.getLocationInWindow(iArr);
            targetView.getLocationInWindow(iArr2);
            return new Pair<>(Integer.valueOf(iArr[0] - iArr2[0]), Integer.valueOf(iArr[1] - iArr2[1]));
        } catch (Exception unused) {
            return null;
        }
    }
}
