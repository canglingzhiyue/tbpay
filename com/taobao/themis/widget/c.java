package com.taobao.themis.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"getGestureMode", "", "Lcom/taobao/themis/kernel/TMSInstance;", "getTMSPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "Lcom/taobao/android/weex/WeexInstance;", "setGestureMode", "", "gestureMode", "setTMSPage", "page", "themis_widget_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1299093295);
    }

    public static final ITMSPage a(WeexInstance getTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("fc36903b", new Object[]{getTMSPage});
        }
        q.d(getTMSPage, "$this$getTMSPage");
        Object tag = getTMSPage.getTag("tmsPage");
        if (!(tag instanceof ITMSPage)) {
            tag = null;
        }
        return (ITMSPage) tag;
    }

    public static final void a(WeexInstance setTMSPage, ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31ef531", new Object[]{setTMSPage, page});
            return;
        }
        q.d(setTMSPage, "$this$setTMSPage");
        q.d(page, "page");
        setTMSPage.setTag("tmsPage", page);
    }

    public static final void a(f setGestureMode, String gestureMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67562b7", new Object[]{setGestureMode, gestureMode});
            return;
        }
        q.d(setGestureMode, "$this$setGestureMode");
        q.d(gestureMode, "gestureMode");
        setGestureMode.a("gestureMode", gestureMode);
    }

    public static final String a(f getGestureMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9586a13", new Object[]{getGestureMode});
        }
        q.d(getGestureMode, "$this$getGestureMode");
        return getGestureMode.d("gestureMode");
    }
}
