package com.etao.feimagesearch.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import tb.kge;

/* loaded from: classes4.dex */
public final class PicParamUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final String f7004a;

    /* loaded from: classes4.dex */
    public enum CameraMode {
        front,
        back,
        unknown
    }

    public static final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f7004a;
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(106610968);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : PicParamUtils.a();
        }

        public final String a(boolean z, PhotoFrom.Values photoFrom) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7a60d14a", new Object[]{this, new Boolean(z), photoFrom});
            }
            kotlin.jvm.internal.q.c(photoFrom, "photoFrom");
            if (photoFrom != PhotoFrom.Values.TAKE) {
                return CameraMode.unknown.name();
            }
            if (z) {
                return CameraMode.front.name();
            }
            return CameraMode.back.name();
        }
    }

    public static final /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f7004a;
    }

    static {
        kge.a(-1267410480);
        Companion = new a(null);
        f7004a = f7004a;
    }
}
