package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.j;
import com.alibaba.android.split.service.SplitInstallServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.split.diff.b;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.bgi;

/* loaded from: classes2.dex */
public class bhj<Param> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<SplitFileInfo> f25903a;
    private final Param b;
    private final boolean c;
    private final SplitInstallServiceImpl.a d;
    private final List e;
    private final Map<String, Intent> f;
    private bgi g;
    private final Context h;
    private j i;
    private b j;
    private xin k;
    private bgu l;
    private final Map<String, Intent> m;
    private final boolean n;

    static {
        kge.a(-917334490);
    }

    public static /* synthetic */ int a(bhj bhjVar, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9793bc58", new Object[]{bhjVar, list})).intValue() : bhjVar.a(list);
    }

    public static /* synthetic */ j a(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("5dad4b51", new Object[]{bhjVar}) : bhjVar.i;
    }

    public static /* synthetic */ String a(bhj bhjVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec53ec22", new Object[]{bhjVar, str}) : bhjVar.a(str);
    }

    public static /* synthetic */ Object b(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ff2481dd", new Object[]{bhjVar}) : bhjVar.b;
    }

    public static /* synthetic */ Context c(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3e64816e", new Object[]{bhjVar}) : bhjVar.h;
    }

    public static /* synthetic */ boolean d(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad43aafb", new Object[]{bhjVar})).booleanValue() : bhjVar.c;
    }

    public static /* synthetic */ bgu e(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgu) ipChange.ipc$dispatch("ae93ab3e", new Object[]{bhjVar}) : bhjVar.l;
    }

    public static /* synthetic */ List f(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6798092e", new Object[]{bhjVar}) : bhjVar.e;
    }

    public static /* synthetic */ SplitInstallServiceImpl.a g(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SplitInstallServiceImpl.a) ipChange.ipc$dispatch("dace00a", new Object[]{bhjVar}) : bhjVar.d;
    }

    public static /* synthetic */ boolean h(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("674fc4ff", new Object[]{bhjVar})).booleanValue() : bhjVar.n;
    }

    public static /* synthetic */ b i(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f042c28d", new Object[]{bhjVar}) : bhjVar.j;
    }

    public static /* synthetic */ xin j(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xin) ipChange.ipc$dispatch("34c6e1ec", new Object[]{bhjVar}) : bhjVar.k;
    }

    public static /* synthetic */ List k(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1bad2e09", new Object[]{bhjVar}) : bhjVar.f25903a;
    }

    public static /* synthetic */ Map l(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("638046f4", new Object[]{bhjVar}) : bhjVar.f;
    }

    public static /* synthetic */ Map m(bhj bhjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("9cd157b5", new Object[]{bhjVar}) : bhjVar.m;
    }

    public static a a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9feb2e5", new Object[]{context}) : new a(context);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        bgi bgiVar = this.g;
        if (bgiVar == null) {
            return;
        }
        bgiVar.a(i);
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f25907a;
        private bgi b;
        private List<SplitFileInfo> c;
        private boolean d;
        private List<String> e;
        private SplitInstallServiceImpl.a f;
        private Map<String, Intent> g;
        private Map<String, Intent> h;
        private boolean i;

        static {
            kge.a(2133583613);
        }

        private a(Context context) {
            this.i = false;
            this.f25907a = context;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4ff87159", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a a(SplitInstallServiceImpl.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("62397fcd", new Object[]{this, aVar});
            }
            this.f = aVar;
            return this;
        }

        public a a(bgi bgiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6de6e631", new Object[]{this, bgiVar});
            }
            this.b = bgiVar;
            return this;
        }

        public a a(List<SplitFileInfo> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cb02760c", new Object[]{this, list});
            }
            this.c = list;
            return this;
        }

        public bhj a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bhj) ipChange.ipc$dispatch("f02c4ba", new Object[]{this}) : new bhj(this.f25907a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public a b(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cbaf21ab", new Object[]{this, list});
            }
            this.e = list;
            return this;
        }

        public a a(Map<String, Intent> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b20529c8", new Object[]{this, map});
            }
            this.g = map;
            return this;
        }

        public a b(Map<String, Intent> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("db550e49", new Object[]{this, map});
            }
            this.h = map;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a9d3db9a", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }
    }

    private bhj(Context context, bgi<Param> bgiVar, List<SplitFileInfo> list, boolean z, List list2, SplitInstallServiceImpl.a aVar, Map<String, Intent> map, Map<String, Intent> map2, boolean z2) {
        this.g = null;
        this.i = (j) com.alibaba.android.split.a.a((Class<? extends Object>) j.class, new Object[0]);
        this.j = null;
        this.k = (xin) com.alibaba.android.split.a.a((Class<? extends Object>) xin.class, new Object[0]);
        this.l = (bgu) com.alibaba.android.split.a.b(bgu.class, "RemoteDownloderFacade");
        this.g = bgiVar;
        this.h = context;
        this.n = z2;
        this.j = new b(context);
        this.f25903a = list;
        this.b = bgiVar.a();
        this.c = z;
        this.e = list2;
        this.d = aVar;
        this.f = map;
        this.m = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(final List<SplitFileInfo> list, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6e9779", new Object[]{this, list, new Integer(i), new Integer(i2)});
        } else if (list == null || list.size() == 0) {
        } else {
            final HashMap hashMap = new HashMap(list.size());
            final ArrayList arrayList = new ArrayList();
            final long currentTimeMillis = System.currentTimeMillis();
            final AtomicInteger atomicInteger = new AtomicInteger();
            atomicInteger.set(this.g.a(list, this.b, null, null, new bgi.b<Object>() { // from class: tb.bhj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private String i = null;

                @Override // tb.bgi.b
                public void a(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20476513", new Object[]{this, str, map});
                        return;
                    }
                    for (SplitFileInfo splitFileInfo : list) {
                        if (!StringUtils.isEmpty(this.i) && this.i.equals(str)) {
                            bhj.a(bhj.this).a(splitFileInfo.splitName, false, "download", 0L, Integer.parseInt(map.get("error_code")), map.get(MUSAppMonitor.ERROR_MSG), i2);
                            return;
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("session_id", i);
                    bundle.putInt("status", 13);
                    bundle.putString(IWXUserTrackAdapter.MONITOR_ARG, bhj.b(bhj.this).toString());
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        SplitFileInfo splitFileInfo2 = (SplitFileInfo) it.next();
                        if (splitFileInfo2.url.equals(str)) {
                            arrayList2.add(splitFileInfo2.splitName);
                            Intent intent = new Intent();
                            intent.putExtra("split_id", splitFileInfo2.splitName);
                            arrayList3.add(intent);
                            break;
                        }
                    }
                    bundle.putStringArrayList("module_names", arrayList2);
                    bundle.putParcelableArrayList("split_file_intents", arrayList3);
                    bgf.a(bhj.c(bhj.this), bhj.c(bhj.this).getPackageName(), bundle);
                }

                @Override // tb.bgi.a
                public void a(int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i3)});
                    } else if (bhj.d(bhj.this)) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("session_id", i);
                        bundle.putInt("status", 2);
                        bundle.putInt("error_code", 0);
                        bundle.putLong("bytes_downloaded", i3);
                        bundle.putLong("total_bytes_to_download", bhj.a(bhj.this, list));
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                        for (SplitFileInfo splitFileInfo : list) {
                            arrayList2.add(splitFileInfo.splitName);
                            Intent intent = new Intent();
                            intent.putExtra("split_id", splitFileInfo.splitName);
                            arrayList3.add(intent);
                        }
                        bundle.putStringArrayList("module_names", arrayList2);
                        bundle.putParcelableArrayList("split_file_intents", arrayList3);
                        bgf.a(bhj.c(bhj.this), bhj.c(bhj.this).getPackageName(), bundle);
                    }
                }

                @Override // tb.bgi.a
                public void a(String str, int i3, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i3), str2});
                        return;
                    }
                    bhj.e(bhj.this).d("onDownloadError......%s...%s...%s", str, Integer.valueOf(i3), str2);
                    this.i = str;
                    if (!bhj.d(bhj.this)) {
                        return;
                    }
                    if (i3 == -14) {
                        bhj.a(bhj.this).a((String) bhj.f(bhj.this).get(0), false, "download", 0L, -14, "network disconnected", i2);
                    } else if (i3 == -16) {
                        bhj.a(bhj.this).a((String) bhj.f(bhj.this).get(0), false, "download", 0L, -16, "network timeout", i2);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("session_id", i);
                    bundle.putInt("status", 6);
                    bundle.putInt(PushMessageHelper.ERROR_TYPE, -200);
                    bundle.putInt("error_code", i3);
                    bundle.putString(IWXUserTrackAdapter.MONITOR_ARG, str2);
                    bundle.putLong("bytes_downloaded", 0L);
                    bundle.putLong("total_bytes_to_download", ((SplitFileInfo) list.get(0)).fileSize);
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    for (SplitFileInfo splitFileInfo : list) {
                        arrayList2.add(splitFileInfo.splitName);
                        Intent intent = new Intent();
                        intent.putExtra("split_id", splitFileInfo.splitName);
                        arrayList3.add(intent);
                    }
                    bundle.putStringArrayList("module_names", arrayList2);
                    bundle.putParcelableArrayList("split_file_intents", arrayList3);
                    bgf.a(bhj.c(bhj.this), bhj.c(bhj.this).getPackageName(), bundle);
                    if (bhj.g(bhj.this) == null) {
                        return;
                    }
                    bhj.g(bhj.this).onDownloadStateChange(SplitInstallServiceImpl.b.a(6, atomicInteger.get(), i3, str2, 0, 0, bhj.f(bhj.this)));
                }

                @Override // tb.bgi.a
                public void a(final String str, final String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else {
                        bgj.a().a(new Runnable() { // from class: tb.bhj.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public void run() {
                                /*
                                    Method dump skipped, instructions count: 651
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: tb.bhj.AnonymousClass1.RunnableC10911.run():void");
                            }
                        });
                    }
                }

                @Override // tb.bgi.a
                public void a(final boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else {
                        bgj.a().a(new Runnable() { // from class: tb.bhj.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (!bhj.d(bhj.this)) {
                                    if (!z || arrayList.size() != 0) {
                                        if (bhj.g(bhj.this) == null) {
                                            return;
                                        }
                                        bhj.g(bhj.this).onDownloadStateChange(SplitInstallServiceImpl.b.a(6, atomicInteger.get(), -6, "download failed", 0, 0, bhj.f(bhj.this)));
                                        return;
                                    }
                                    bhj.k(bhj.this).addAll(list);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("session_id", i);
                                    bundle.putInt("status", 3);
                                    bundle.putInt("error_code", 0);
                                    bundle.putLong("bytes_downloaded", bhj.a(bhj.this, bhj.k(bhj.this)));
                                    bundle.putLong("total_bytes_to_download", bhj.a(bhj.this, bhj.k(bhj.this)));
                                    ArrayList arrayList2 = new ArrayList();
                                    ArrayList arrayList3 = new ArrayList();
                                    for (SplitFileInfo splitFileInfo : bhj.k(bhj.this)) {
                                        if (!bhj.l(bhj.this).keySet().contains(splitFileInfo.splitName) && !bhj.m(bhj.this).keySet().contains(splitFileInfo.splitName)) {
                                            arrayList2.add(splitFileInfo.splitName);
                                            Intent intent = new Intent();
                                            intent.putExtra("split_id", splitFileInfo.splitName);
                                            String str = (String) hashMap.get(bhj.a(bhj.this, splitFileInfo.splitName));
                                            if (!StringUtils.isEmpty(str) && new File(str).exists()) {
                                                intent.setData(Uri.fromFile(new File(str)));
                                            }
                                            arrayList3.add(intent);
                                        }
                                    }
                                    for (Map.Entry entry : bhj.l(bhj.this).entrySet()) {
                                        arrayList2.add((String) entry.getKey());
                                        arrayList3.add((Intent) entry.getValue());
                                    }
                                    for (Map.Entry entry2 : bhj.m(bhj.this).entrySet()) {
                                        arrayList2.add((String) entry2.getKey());
                                        arrayList3.add((Intent) entry2.getValue());
                                    }
                                    bundle.putStringArrayList("module_names", new ArrayList<>(arrayList2));
                                    bundle.putParcelableArrayList("split_file_intents", new ArrayList<>(arrayList3));
                                    bgf.a(bhj.c(bhj.this), bhj.c(bhj.this).getPackageName(), bundle);
                                    if (bhj.g(bhj.this) == null) {
                                        return;
                                    }
                                    bhj.g(bhj.this).onDownloadStateChange(SplitInstallServiceImpl.b.a(3, atomicInteger.get(), 0, "", bhj.a(bhj.this, list), bhj.a(bhj.this, list), bhj.f(bhj.this)));
                                } else {
                                    try {
                                        if (!z || arrayList.size() != 0) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putInt("session_id", i);
                                            bundle2.putInt("status", 6);
                                            bundle2.putInt("error_code", -6);
                                            bundle2.putLong("bytes_downloaded", ((SplitFileInfo) list.get(0)).fileSize);
                                            bundle2.putLong("total_bytes_to_download", ((SplitFileInfo) list.get(0)).fileSize);
                                            ArrayList<String> arrayList4 = new ArrayList<>();
                                            ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                                            for (SplitFileInfo splitFileInfo2 : list) {
                                                arrayList4.add(splitFileInfo2.splitName);
                                                Intent intent2 = new Intent();
                                                intent2.putExtra("split_id", splitFileInfo2.splitName);
                                                String str2 = (String) hashMap.get(bhj.a(bhj.this, splitFileInfo2.splitName));
                                                if (!StringUtils.isEmpty(str2) && new File(str2).exists()) {
                                                    intent2.setData(Uri.fromFile(new File(str2)));
                                                }
                                                arrayList5.add(intent2);
                                            }
                                            bundle2.putStringArrayList("module_names", arrayList4);
                                            bundle2.putParcelableArrayList("split_file_intents", arrayList5);
                                            bgf.a(bhj.c(bhj.this), bhj.c(bhj.this).getPackageName(), bundle2);
                                            return;
                                        }
                                        bhj.k(bhj.this).addAll(list);
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putInt("session_id", i);
                                        bundle3.putInt("status", 3);
                                        bundle3.putInt("error_code", 0);
                                        bundle3.putLong("bytes_downloaded", ((SplitFileInfo) list.get(0)).fileSize);
                                        bundle3.putLong("total_bytes_to_download", ((SplitFileInfo) list.get(0)).fileSize);
                                        ArrayList<String> arrayList6 = new ArrayList<>();
                                        ArrayList<? extends Parcelable> arrayList7 = new ArrayList<>();
                                        for (SplitFileInfo splitFileInfo3 : bhj.k(bhj.this)) {
                                            if (!bhj.l(bhj.this).keySet().contains(splitFileInfo3.splitName) && !bhj.m(bhj.this).keySet().contains(splitFileInfo3.splitName)) {
                                                arrayList6.add(splitFileInfo3.splitName);
                                                Intent intent3 = new Intent();
                                                intent3.putExtra("split_id", splitFileInfo3.splitName);
                                                String str3 = (String) hashMap.get(splitFileInfo3.splitName);
                                                if (!StringUtils.isEmpty(str3) && new File(str3).exists()) {
                                                    intent3.setData(Uri.fromFile(new File(str3)));
                                                }
                                                arrayList7.add(intent3);
                                            }
                                        }
                                        for (Map.Entry entry3 : bhj.l(bhj.this).entrySet()) {
                                            arrayList6.add((String) entry3.getKey());
                                            arrayList7.add((Intent) entry3.getValue());
                                        }
                                        for (Map.Entry entry4 : bhj.m(bhj.this).entrySet()) {
                                            arrayList6.add((String) entry4.getKey());
                                            arrayList7.add((Intent) entry4.getValue());
                                        }
                                        if (arrayList6.size() <= 0) {
                                            return;
                                        }
                                        bundle3.putStringArrayList("module_names", arrayList6);
                                        bundle3.putParcelableArrayList("split_file_intents", arrayList7);
                                        bgf.a(bhj.c(bhj.this), bhj.c(bhj.this).getPackageName(), bundle3);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        });
                    }
                }
            }));
            SplitInstallServiceImpl.a aVar = this.d;
            if (aVar == null) {
                return;
            }
            aVar.onDownloadStateChange(SplitInstallServiceImpl.b.a(2, atomicInteger.get(), 0, "", 0, a(list), this.e));
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : str.concat(bgy.APK_EXTENSION);
    }

    private int a(List<SplitFileInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{this, list})).intValue();
        }
        long j = 0;
        for (SplitFileInfo splitFileInfo : list) {
            j = splitFileInfo.fileSize;
        }
        return (int) j;
    }
}
