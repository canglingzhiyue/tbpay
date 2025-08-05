package com.etao.feimagesearch.history;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.history.AuctionItemVO;
import com.etao.feimagesearch.k;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.i;
import com.etao.feimagesearch.util.l;
import com.taobao.android.task.Coordinator;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import tb.com;
import tb.cot;
import tb.cug;
import tb.cuj;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f6677a;
    private HistoryResult b = null;

    public static /* synthetic */ long a(a aVar, File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9bdc108b", new Object[]{aVar, file})).longValue() : aVar.a(file);
    }

    public static /* synthetic */ boolean a(a aVar, HistoryResult historyResult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19c9870c", new Object[]{aVar, historyResult})).booleanValue() : aVar.b(historyResult);
    }

    public static /* synthetic */ boolean a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f753a0ee", new Object[]{aVar, str})).booleanValue() : aVar.a(str);
    }

    static {
        kge.a(918828255);
        f6677a = null;
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7029f5a6", new Object[0]);
        }
        if (f6677a == null) {
            synchronized (a.class) {
                if (f6677a == null) {
                    f6677a = new a();
                }
            }
        }
        return f6677a;
    }

    public HistoryResult b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryResult) ipChange.ipc$dispatch("e4369a75", new Object[]{this});
        }
        if (this.b == null) {
            d();
        }
        return this.b.deepClone();
    }

    public HistoryResult a(String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryResult) ipChange.ipc$dispatch("7e2a1efd", new Object[]{this, str, new Boolean(z), new Integer(i)});
        }
        if (this.b == null) {
            d();
        }
        if (this.b.resultData.isEmpty()) {
            return this.b;
        }
        if (i <= 0) {
            i = 50;
        }
        if (TextUtils.isEmpty(str)) {
            str = "all";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(this.b.resultData.keySet());
        if (z) {
            Collections.sort(arrayList);
        } else {
            Collections.sort(arrayList, Collections.reverseOrder());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Long l = (Long) arrayList.get(i3);
            AuctionItemVO auctionItemVO = this.b.resultData.get(l);
            if (i2 >= i) {
                break;
            }
            if (auctionItemVO != null && auctionItemVO.mSource != null && auctionItemVO.mSource.intValue() != AuctionItemVO.ItemSource.REMOTE_TFS.getValue()) {
                if (auctionItemVO.mSource.intValue() == AuctionItemVO.ItemSource.LOCAL_ALBUM.getValue()) {
                    String uri = TextUtils.isEmpty(auctionItemVO.fileUrl) ? auctionItemVO.picPath.toString() : auctionItemVO.fileUrl;
                    if (auctionItemVO.picPath != null) {
                        if (!i.c(uri)) {
                        }
                    }
                }
                AuctionItemVO deepClone = auctionItemVO.deepClone();
                if (TextUtils.equals("image", str) && !deepClone.isVideo) {
                    linkedHashMap.put(l, deepClone);
                } else if (TextUtils.equals("video", str) && deepClone.isVideo) {
                    linkedHashMap.put(l, deepClone);
                } else {
                    linkedHashMap.put(l, deepClone);
                }
                i2++;
            }
        }
        HistoryResult historyResult = new HistoryResult();
        historyResult.resultData = linkedHashMap;
        return historyResult;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        HistoryResult historyResult = this.b;
        if (historyResult == null) {
            this.b = new HistoryResult();
            this.b.resultData = new HashMap();
        } else {
            historyResult.clear();
        }
        Coordinator.execute(new Runnable() { // from class: com.etao.feimagesearch.history.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                cuj.a(com.b(), "history_data");
                l.a(com.b());
            }
        });
    }

    public void a(AuctionItemVO auctionItemVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ea5232", new Object[]{this, auctionItemVO});
        } else if (auctionItemVO == null || auctionItemVO.timeStr == null) {
        } else {
            if (this.b == null) {
                d();
            }
            if (this.b.resultData.isEmpty()) {
                return;
            }
            this.b.resultData.remove(auctionItemVO.timeStr);
            final String str = auctionItemVO.fileUrl;
            final String jSONString = JSONObject.toJSONString(this.b);
            Coordinator.execute(new Runnable() { // from class: com.etao.feimagesearch.history.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.a(a.this, jSONString);
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    a.a(a.this, new File(str));
                }
            });
        }
    }

    public AuctionItemVO a(Context context, String str, Bitmap bitmap, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionItemVO) ipChange.ipc$dispatch("588745ff", new Object[]{this, context, str, bitmap, map});
        }
        String a2 = l.a(context, bitmap, 90);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        AuctionItemVO auctionItemVO = new AuctionItemVO();
        auctionItemVO.picPath = Uri.parse(a2);
        auctionItemVO.fileUrl = a2;
        auctionItemVO.photofrom = str;
        auctionItemVO.mSource = Integer.valueOf(AuctionItemVO.ItemSource.LOCAL_ALBUM.getValue());
        if (map != null) {
            auctionItemVO.mExtraJSKV = new HashMap(map);
        }
        auctionItemVO.timeStr = Long.valueOf(com.j());
        b(auctionItemVO);
        return auctionItemVO;
    }

    public AuctionItemVO a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionItemVO) ipChange.ipc$dispatch("4d50a837", new Object[]{this, str, str2, map});
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        AuctionItemVO auctionItemVO = new AuctionItemVO();
        auctionItemVO.picPath = Uri.parse(str2);
        auctionItemVO.fileUrl = str2;
        auctionItemVO.photofrom = str;
        auctionItemVO.mSource = Integer.valueOf(AuctionItemVO.ItemSource.LOCAL_ALBUM.getValue());
        if (map != null) {
            auctionItemVO.mExtraJSKV = new HashMap(map);
        }
        auctionItemVO.timeStr = Long.valueOf(com.j());
        b(auctionItemVO);
        return auctionItemVO;
    }

    public AuctionItemVO a(Context context, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionItemVO) ipChange.ipc$dispatch("7e43d9f9", new Object[]{this, context, str, str2, str3, map});
        }
        if (context == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        AuctionItemVO auctionItemVO = new AuctionItemVO();
        auctionItemVO.picPath = Uri.parse(str2);
        auctionItemVO.fileUrl = str3;
        auctionItemVO.photofrom = str;
        auctionItemVO.mSource = Integer.valueOf(AuctionItemVO.ItemSource.LOCAL_ALBUM.getValue());
        if (map != null) {
            auctionItemVO.mExtraJSKV = new HashMap(map);
        }
        auctionItemVO.timeStr = Long.valueOf(com.j());
        b(auctionItemVO);
        return auctionItemVO;
    }

    public void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{this, context, str, str2, str3});
        } else if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
        } else {
            AuctionItemVO auctionItemVO = new AuctionItemVO();
            auctionItemVO.picPath = Uri.parse(str3);
            auctionItemVO.fileUrl = str;
            auctionItemVO.isVideo = true;
            auctionItemVO.duration = str2;
            auctionItemVO.mSource = Integer.valueOf(AuctionItemVO.ItemSource.LOCAL_ALBUM.getValue());
            auctionItemVO.timeStr = Long.valueOf(com.j());
            b(auctionItemVO);
        }
    }

    public long a(HistoryResult historyResult) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4335f644", new Object[]{this, historyResult})).longValue();
        }
        if (historyResult == null || historyResult.resultData == null || historyResult.resultData.isEmpty() || !com.etao.feimagesearch.config.b.dk()) {
            return 0L;
        }
        long a2 = a(com.b(), historyResult);
        ArrayList arrayList = new ArrayList(historyResult.resultData.keySet());
        Collections.sort(arrayList);
        long dm = com.etao.feimagesearch.config.b.dm();
        long j = com.j();
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            Long l = (Long) listIterator.next();
            if (j - l.longValue() > dm) {
                i++;
                listIterator.remove();
                AuctionItemVO remove = historyResult.resultData.remove(l);
                if (remove != null) {
                    a(new File(remove.fileUrl));
                }
            }
        }
        if (i > 0) {
            b(historyResult);
        }
        long j2 = a2 + i;
        cot.c("HistoryModel", "delete file length " + j2);
        return j2;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        HistoryResult historyResult = this.b;
        if (historyResult == null) {
            return;
        }
        c(historyResult.deepClone());
    }

    private boolean b(HistoryResult historyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86c11415", new Object[]{this, historyResult})).booleanValue();
        }
        try {
            k.a(com.b(), "history_data", JSON.toJSONString(historyResult));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            k.a(com.b(), "history_data", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    private void d() {
        HistoryResult historyResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = new HistoryResult();
        this.b.resultData = new HashMap();
        String b = cuj.b(com.b(), "history_data", "");
        if (TextUtils.isEmpty(b)) {
            cug.b("HistoryModel", "history not exist");
            return;
        }
        try {
            historyResult = (HistoryResult) JSON.parseObject(b, HistoryResult.class);
        } catch (Exception unused) {
            cug.a("HistoryModel", "history parse error");
            historyResult = null;
        }
        if (historyResult == null || historyResult.resultData == null) {
            return;
        }
        cug.a("HistoryModel", "history load success:count " + historyResult.resultData.size());
        this.b = historyResult;
    }

    private void b(AuctionItemVO auctionItemVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4756ff3", new Object[]{this, auctionItemVO});
            return;
        }
        if (this.b == null) {
            d();
        }
        a(this.b.deepClone(), auctionItemVO);
        ArrayList arrayList = new ArrayList(this.b.resultData.keySet());
        if (arrayList.size() >= 50) {
            Collections.sort(arrayList);
            ListIterator listIterator = arrayList.listIterator();
            for (int size = arrayList.size(); listIterator.hasNext() && size > 49; size--) {
                this.b.resultData.remove((Long) listIterator.next());
                listIterator.remove();
            }
        }
        this.b.resultData.put(auctionItemVO.timeStr, auctionItemVO);
    }

    private void c(final HistoryResult historyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4c31d2", new Object[]{this, historyResult});
        } else {
            Coordinator.execute(new ac() { // from class: com.etao.feimagesearch.history.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    if (com.etao.feimagesearch.config.b.dk()) {
                        a.this.a(historyResult);
                    }
                    ArrayList arrayList = new ArrayList(historyResult.resultData.keySet());
                    if (arrayList.size() >= 50) {
                        Collections.sort(arrayList);
                        ListIterator listIterator = arrayList.listIterator();
                        for (int size = arrayList.size(); listIterator.hasNext() && size > 49; size--) {
                            historyResult.resultData.remove((Long) listIterator.next());
                            listIterator.remove();
                        }
                    }
                    a.a(a.this, historyResult);
                }
            });
        }
    }

    private void a(final HistoryResult historyResult, final AuctionItemVO auctionItemVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ec61a", new Object[]{this, historyResult, auctionItemVO});
        } else if (!com.etao.feimagesearch.config.b.ds()) {
        } else {
            Coordinator.execute(new ac() { // from class: com.etao.feimagesearch.history.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    if (com.etao.feimagesearch.config.b.dk()) {
                        a.this.a(historyResult);
                    }
                    ArrayList arrayList = new ArrayList(historyResult.resultData.keySet());
                    if (arrayList.size() >= 50) {
                        Collections.sort(arrayList);
                        ListIterator listIterator = arrayList.listIterator();
                        for (int size = arrayList.size(); listIterator.hasNext() && size > 49; size--) {
                            historyResult.resultData.remove((Long) listIterator.next());
                            listIterator.remove();
                        }
                    }
                    historyResult.resultData.put(auctionItemVO.timeStr, auctionItemVO);
                    a.a(a.this, historyResult);
                }
            });
        }
    }

    private long a(Context context, HistoryResult historyResult) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d123bc3c", new Object[]{this, context, historyResult})).longValue();
        }
        if (!com.etao.feimagesearch.config.b.dl()) {
            return 0L;
        }
        try {
            File[] listFiles = context.getCacheDir().listFiles(new FilenameFilter() { // from class: com.etao.feimagesearch.history.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("6696dd14", new Object[]{this, file, str})).booleanValue();
                    }
                    try {
                        return l.a(new File(file, str));
                    } catch (Exception unused) {
                        return false;
                    }
                }
            });
            if (listFiles == null) {
                return 0L;
            }
            HashSet hashSet = new HashSet(historyResult.resultData.size());
            for (AuctionItemVO auctionItemVO : historyResult.resultData.values()) {
                if (auctionItemVO.picPath != null) {
                    String uri = auctionItemVO.picPath.toString();
                    hashSet.add(uri);
                    cot.c("HistoryModel", "path = " + uri);
                }
            }
            i = 0;
            for (File file : listFiles) {
                try {
                    if (!hashSet.contains(file.getAbsolutePath())) {
                        i = (int) (i + a(file));
                    }
                } catch (Exception unused) {
                    return i;
                }
            }
            return i;
        } catch (Exception unused2) {
            i = 0;
        }
    }

    private long a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a979fd3", new Object[]{this, file})).longValue();
        }
        if (!l.a(file)) {
            return 0L;
        }
        cot.c("HistoryModel", "deleteCacheFile " + file.getAbsolutePath());
        long length = file.length();
        if (!i.b(file.getAbsolutePath())) {
            return 0L;
        }
        return length;
    }
}
