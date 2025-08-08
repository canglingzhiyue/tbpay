package com.taobao.android.detail.core.open;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.open.DetailBusinessDetector;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ecg;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c implements DetailBusinessDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DetailBusinessDetector b;

    /* renamed from: a  reason: collision with root package name */
    private List<DetailBusinessDetector> f9775a = new ArrayList();
    private boolean c = false;

    static {
        kge.a(-1428425034);
        kge.a(1436843255);
    }

    public c() {
        emu.a("com.taobao.android.detail.core.open.DetailBusinessDetectorManager");
    }

    public void a(DetailBusinessDetector detailBusinessDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9c2640", new Object[]{this, detailBusinessDetector});
        } else if (this.f9775a.contains(detailBusinessDetector)) {
        } else {
            this.f9775a.add(detailBusinessDetector);
        }
    }

    @Override // com.taobao.android.detail.core.open.DetailBusinessDetector
    public boolean isDefaultDetailApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdd7679d", new Object[]{this})).booleanValue();
        }
        DetailBusinessDetector detailBusinessDetector = this.b;
        return detailBusinessDetector == null || detailBusinessDetector.isDefaultDetailApi();
    }

    @Override // com.taobao.android.detail.core.open.DetailBusinessDetector
    public DetailBusinessDetector.DetectResult detect(String str, DetailCoreActivity detailCoreActivity) {
        DetailBusinessDetector.DetectResult detect;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailBusinessDetector.DetectResult) ipChange.ipc$dispatch("3e61846b", new Object[]{this, str, detailCoreActivity});
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme != null && StringUtils.equals("taobao", scheme.toLowerCase())) {
            return DetailBusinessDetector.DetectResult.no;
        }
        Iterator<DetailBusinessDetector> it = this.f9775a.iterator();
        while (it.hasNext()) {
            DetailBusinessDetector next = it.next();
            try {
                detect = next.detect(str, detailCoreActivity);
            } catch (Throwable th) {
                it.remove();
                com.taobao.android.detail.core.utils.i.a("DetailBusinessDetectorManager", "detect(String)", th);
                ecg.d(detailCoreActivity, detailCoreActivity.getPackageName(), th);
            }
            if (detect == DetailBusinessDetector.DetectResult.yes_native) {
                this.b = next;
                String queryParameter = parse.getQueryParameter("id");
                if (StringUtils.isEmpty(queryParameter)) {
                    queryParameter = parse.getQueryParameter("item_id");
                    if (StringUtils.isEmpty(queryParameter)) {
                        queryParameter = "";
                    }
                }
                ecg.c(detailCoreActivity, queryParameter, "", DetailBusinessDetector.DetectResult.yes_native.name(), str);
                return detect;
            }
            continue;
        }
        return DetailBusinessDetector.DetectResult.no;
    }

    @Override // com.taobao.android.detail.core.open.DetailBusinessDetector
    public boolean detect(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2adf01b", new Object[]{this, bVar, detailCoreActivity})).booleanValue();
        }
        if (this.b != null) {
            return false;
        }
        Iterator<DetailBusinessDetector> it = this.f9775a.iterator();
        while (it.hasNext()) {
            DetailBusinessDetector next = it.next();
            try {
            } catch (Throwable th) {
                it.remove();
                com.taobao.android.detail.core.utils.i.a("DetailBusinessDetectorManager", "detect(nodeBundle)", th);
                ecg.d(detailCoreActivity, detailCoreActivity.getPackageName(), th);
            }
            if (next.detect(bVar, detailCoreActivity)) {
                this.b = next;
                ecg.c(detailCoreActivity, new com.taobao.android.detail.datasdk.model.datamodel.node.c(bVar).i(), ((FeatureNode) bVar.b("feature", FeatureNode.class)).isTmallGlobal ? "tmallGlobal" : "", DetailBusinessDetector.DetectResult.yes_native.name(), "");
                return true;
            }
            continue;
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.open.DetailBusinessDetector
    public void reCustomizeDetail(g gVar, DetailCoreActivity detailCoreActivity) {
        DetailBusinessDetector detailBusinessDetector;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d0a9e9", new Object[]{this, gVar, detailCoreActivity});
        } else if (this.c || (detailBusinessDetector = this.b) == null) {
        } else {
            try {
                detailBusinessDetector.reCustomizeDetail(gVar, detailCoreActivity);
                this.c = true;
            } catch (Throwable th) {
                this.f9775a.remove(this.b);
                com.taobao.android.detail.core.utils.i.a("DetailBusinessDetectorManager", "reCustomizeDetail", th);
                ecg.d(detailCoreActivity, detailCoreActivity.getPackageName(), th);
            }
        }
    }
}
