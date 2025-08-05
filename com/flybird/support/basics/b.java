package com.flybird.support.basics;

import com.alipay.birdnest.platform.ConnectionUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.idy;
import tb.ieb;

/* loaded from: classes4.dex */
public abstract class b<Ret, Arg> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final b<String, Void> f7231a = new b<String, Void>() { // from class: com.flybird.support.basics.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
        @Override // com.flybird.support.basics.b
        public String a(String str, Void r5) throws Throwable {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, r5}) : str;
        }

        @Override // com.flybird.support.basics.b
        public /* bridge */ /* synthetic */ String a(String str, Void r2, Throwable th) {
            return null;
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.lang.String] */
        @Override // com.flybird.support.basics.b
        public String a(File file, Void r5) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, r5});
            }
            ieb.a();
            return ConnectionUtils.b(idy.b(file));
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
        @Override // com.flybird.support.basics.b
        public String a(byte[] bArr, Void r5) throws Throwable {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, r5}) : ConnectionUtils.b(bArr);
        }
    };
    public static final b<byte[], Void> b = new b<byte[], Void>() { // from class: com.flybird.support.basics.b.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.flybird.support.basics.b
        public /* bridge */ /* synthetic */ byte[] a(String str, Void r2, Throwable th) {
            return null;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [byte[], java.lang.Object] */
        @Override // com.flybird.support.basics.b
        public byte[] a(byte[] bArr, Void r5) throws Throwable {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, r5}) : bArr;
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [byte[], java.lang.Object] */
        @Override // com.flybird.support.basics.b
        public byte[] a(File file, Void r5) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, r5});
            }
            ieb.a();
            return idy.b(file);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [byte[], java.lang.Object] */
        @Override // com.flybird.support.basics.b
        public byte[] a(String str, Void r5) throws Throwable {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, r5}) : ConnectionUtils.a(str);
        }
    };

    public abstract Ret a(File file, Arg arg) throws Throwable;

    public Ret a(Object obj, Arg arg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ret) ipChange.ipc$dispatch("218a0212", new Object[]{this, obj, arg});
        }
        try {
            if (obj instanceof byte[]) {
                return a((byte[]) obj, (byte[]) arg);
            }
            if (obj instanceof String) {
                return a((String) obj, (String) arg);
            }
            if (obj instanceof File) {
                return a((File) obj, (File) arg);
            }
            return a("can't handle " + obj.getClass(), arg, new RuntimeException());
        } catch (Throwable th) {
            return a("exception on " + obj.getClass(), arg, th);
        }
    }

    public abstract Ret a(String str, Arg arg) throws Throwable;

    public abstract Ret a(String str, Arg arg, Throwable th);

    public abstract Ret a(byte[] bArr, Arg arg) throws Throwable;
}
