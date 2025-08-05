package com.etao.feimagesearch.capture.perf;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.g;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes3.dex */
public final class MnnOnceDetectRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private long f6577a;
    private boolean b;
    private Long mnnInferTime;
    private Long mnnLogicTime;
    private Long mnnPostTime;
    private Long mnnPreTime;
    private Long mnnPreTransTime;
    private Long mnnTime;

    static {
        kge.a(-925846764);
        Companion = new a(null);
    }

    @JvmStatic
    public static final MnnOnceDetectRecord parse(long j, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MnnOnceDetectRecord) ipChange.ipc$dispatch("842af5d", new Object[]{new Long(j), str, new Boolean(z)}) : Companion.a(j, str, z);
    }

    public MnnOnceDetectRecord(long j, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, boolean z) {
        this.f6577a = j;
        this.mnnTime = l;
        this.mnnPreTime = l2;
        this.mnnInferTime = l3;
        this.mnnLogicTime = l4;
        this.mnnPostTime = l5;
        this.mnnPreTransTime = l6;
        this.b = z;
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f6577a;
    }

    public final void setCostTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb7f1e1", new Object[]{this, new Long(j)});
        } else {
            this.f6577a = j;
        }
    }

    public final Long getMnnTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("88a0d00a", new Object[]{this}) : this.mnnTime;
    }

    public final void setMnnTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85584b5e", new Object[]{this, l});
        } else {
            this.mnnTime = l;
        }
    }

    public final Long getMnnPreTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("9b418b5", new Object[]{this}) : this.mnnPreTime;
    }

    public final void setMnnPreTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b2dcab", new Object[]{this, l});
        } else {
            this.mnnPreTime = l;
        }
    }

    public final Long getMnnInferTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("fb9180ea", new Object[]{this}) : this.mnnInferTime;
    }

    public final void setMnnInferTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8ea816", new Object[]{this, l});
        } else {
            this.mnnInferTime = l;
        }
    }

    public final Long getMnnLogicTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("55d8cfda", new Object[]{this}) : this.mnnLogicTime;
    }

    public final void setMnnLogicTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29313726", new Object[]{this, l});
        } else {
            this.mnnLogicTime = l;
        }
    }

    public final Long getMnnPostTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("d7db0eca", new Object[]{this}) : this.mnnPostTime;
    }

    public final void setMnnPostTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cb0a9e", new Object[]{this, l});
        } else {
            this.mnnPostTime = l;
        }
    }

    public final Long getMnnPreTransTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("5cd2385", new Object[]{this}) : this.mnnPreTransTime;
    }

    public final void setMnnPreTransTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357db343", new Object[]{this, l});
        } else {
            this.mnnPreTransTime = l;
        }
    }

    public /* synthetic */ MnnOnceDetectRecord(long j, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, boolean z, int i, o oVar) {
        this(j, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? 0L : l2, (i & 8) != 0 ? 0L : l3, (i & 16) != 0 ? 0L : l4, (i & 32) != 0 ? 0L : l5, (i & 64) != 0 ? 0L : l6, (i & 128) != 0 ? false : z);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public final void setDetectRegion(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400c71d4", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(221959516);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final MnnOnceDetectRecord a(long j, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MnnOnceDetectRecord) ipChange.ipc$dispatch("3851090b", new Object[]{this, new Long(j), str, new Boolean(z)});
            }
            MnnOnceDetectRecord mnnOnceDetectRecord = new MnnOnceDetectRecord(j, null, null, null, null, null, null, z, 126, null);
            if (str != null) {
                String str2 = str;
                if (!TextUtils.isEmpty(str2)) {
                    for (String str3 : n.b((CharSequence) str2, new String[]{"|"}, false, 0, 6, (Object) null)) {
                        List b = n.b((CharSequence) str3, new String[]{":"}, false, 0, 6, (Object) null);
                        if (b.size() == 2) {
                            String str4 = (String) b.get(0);
                            long a2 = g.a((String) b.get(1), 0.0f) * 1000;
                            switch (str4.hashCode()) {
                                case -2062547186:
                                    if (str4.equals("logic_time")) {
                                        mnnOnceDetectRecord.setMnnLogicTime(Long.valueOf(a2));
                                        break;
                                    } else {
                                        continue;
                                    }
                                case -1294694679:
                                    if (str4.equals("pre_time")) {
                                        mnnOnceDetectRecord.setMnnPreTime(Long.valueOf(a2));
                                        break;
                                    } else {
                                        continue;
                                    }
                                case -233972706:
                                    if (str4.equals("infer_time")) {
                                        mnnOnceDetectRecord.setMnnInferTime(Long.valueOf(a2));
                                        break;
                                    } else {
                                        continue;
                                    }
                                case -207357399:
                                    if (str4.equals("const_time")) {
                                        mnnOnceDetectRecord.setMnnPreTransTime(Long.valueOf(a2));
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 3560141:
                                    if (str4.equals("time")) {
                                        mnnOnceDetectRecord.setMnnTime(Long.valueOf(a2));
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 2002966284:
                                    if (str4.equals("post_time")) {
                                        mnnOnceDetectRecord.setMnnPostTime(Long.valueOf(a2));
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                        }
                    }
                }
            }
            return mnnOnceDetectRecord;
        }
    }
}
