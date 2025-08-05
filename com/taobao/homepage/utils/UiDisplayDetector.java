package com.taobao.homepage.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes7.dex */
public class UiDisplayDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int UI_ERROR_TYPE_ALPHA_INVALID = 4;
    public static final int UI_ERROR_TYPE_CHILDREN_INVALID = 5;
    public static final int UI_ERROR_TYPE_FRAME_INVALID = 3;
    public static final int UI_ERROR_TYPE_INVISIBLE = 1;
    public static final int UI_ERROR_TYPE_NONE = 0;
    public static final int UI_ERROR_TYPE_SIZE_INVALID = 2;

    /* renamed from: a  reason: collision with root package name */
    private a f17280a = new a();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface UiErrorType {
    }

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f17281a = 0;
        public int b = 0;
        public float c = 1.0f;
        public int d = 1;
        public int e = 100;

        static {
            kge.a(374863881);
        }
    }

    static {
        kge.a(-985386360);
    }

    public int a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9501e35d", new Object[]{this, view})).intValue();
        }
        if (!view.isShown()) {
            com.taobao.android.home.component.utils.e.e("UiDisplayDetector", "view is not shown");
            return 1;
        } else if (view.getWidth() <= this.f17280a.f17281a || view.getHeight() <= this.f17280a.b) {
            com.taobao.android.home.component.utils.e.e("UiDisplayDetector", "view size invalid");
            return 2;
        } else {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            boolean localVisibleRect = view.getLocalVisibleRect(new Rect());
            if (!globalVisibleRect || !localVisibleRect) {
                com.taobao.android.home.component.utils.e.e("UiDisplayDetector", "view frame invalid");
                return 3;
            } else if (view.getWidth() - rect.width() > this.f17280a.e || view.getHeight() - rect.height() > this.f17280a.e) {
                com.taobao.android.home.component.utils.e.e("UiDisplayDetector", "view not show fully");
                return 3;
            } else if (view.getAlpha() < this.f17280a.c) {
                com.taobao.android.home.component.utils.e.e("UiDisplayDetector", "view alpha invalid");
                return 4;
            } else if (!(view instanceof DXRootView) || ((ViewGroup) view).getChildCount() >= this.f17280a.d) {
                return 0;
            } else {
                com.taobao.android.home.component.utils.e.e("UiDisplayDetector", "view children invalid");
                return 5;
            }
        }
    }
}
