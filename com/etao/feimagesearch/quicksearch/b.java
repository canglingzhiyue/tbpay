package com.etao.feimagesearch.quicksearch;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FOREGROUND_KEY = "isTbForeground";
    public static final a Instance;

    /* renamed from: a  reason: collision with root package name */
    private static Intent f6959a;
    private static int b;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-443011977);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final Intent a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("fdb8dbab", new Object[]{this}) : b.a();
        }

        public final void a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            } else {
                b.a(intent);
            }
        }

        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                b.a(i);
            }
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : b.b();
        }
    }

    public static final /* synthetic */ Intent a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("fdb8dbab", new Object[0]) : f6959a;
    }

    public static final /* synthetic */ void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else {
            b = i;
        }
    }

    public static final /* synthetic */ void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
        } else {
            f6959a = intent;
        }
    }

    public static final /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : b;
    }

    static {
        kge.a(-1320698206);
        Instance = new a(null);
        b = -1;
    }
}
