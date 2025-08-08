package com.etao.feimagesearch;

import android.net.Uri;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.q;
import com.etao.feimagesearch.cip.capture.components.AlbumMediaItem;
import com.etao.feimagesearch.cip.capture.components.b;
import com.etao.feimagesearch.util.al;
import com.etao.feimagesearch.util.w;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.com;
import tb.cot;
import tb.ctd;
import tb.cuj;
import tb.kge;

/* loaded from: classes3.dex */
public class ImagePopTask implements b.InterfaceC0224b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LAST_VISIT_ITEM_ID = "pop:last_visit_item_id";
    public static final String KEY_LAST_VISIT_TIME = "pop:last_visit_time";
    private boolean alwaysShow;
    private int imageCnt;
    private WeakReference<a> listener;
    private List<AlbumMediaItem> localImageList;
    private boolean needFootprint;

    /* loaded from: classes3.dex */
    public interface a {
        void a(String str, boolean z, Map<String, String> map);
    }

    /* loaded from: classes3.dex */
    public interface b extends a {
        void a(List<AlbumMediaItem> list, List<ctd> list2);
    }

    static {
        kge.a(-1661263638);
        kge.a(1825508937);
    }

    @Override // com.etao.feimagesearch.cip.capture.components.b.InterfaceC0224b
    public boolean isResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7649b58", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ WeakReference access$000(ImagePopTask imagePopTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("9c6e65ce", new Object[]{imagePopTask}) : imagePopTask.listener;
    }

    public ImagePopTask(a aVar) {
        this.imageCnt = 1;
        this.needFootprint = true;
        this.alwaysShow = false;
        this.listener = new WeakReference<>(aVar);
        this.needFootprint = com.etao.feimagesearch.config.b.X();
    }

    public ImagePopTask(a aVar, int i) {
        this(aVar, i, com.etao.feimagesearch.config.b.X());
    }

    public ImagePopTask(a aVar, int i, boolean z) {
        this(aVar);
        this.imageCnt = i;
        this.needFootprint = z;
    }

    public ImagePopTask(a aVar, int i, boolean z, boolean z2) {
        this(aVar, i, z);
        this.alwaysShow = z2;
    }

    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        boolean a2 = al.a(com.b());
        if (this.imageCnt == 1) {
            if (!h.a().b()) {
                onRecentImageShow(null);
                return;
            } else if (!a2) {
                onRecentImageShow(null);
                return;
            } else {
                Uri c = h.a().c();
                h.a().d();
                if (c != null) {
                    AlbumMediaItem albumMediaItem = new AlbumMediaItem();
                    albumMediaItem.canShow = true;
                    albumMediaItem.imgUri = c;
                    onRecentImageShow(Collections.singletonList(albumMediaItem));
                    return;
                }
            }
        }
        new com.etao.feimagesearch.cip.capture.components.b(this, this.imageCnt).execute(new Void[0]);
    }

    private Map<String, String> generateLocalFileTrace(AlbumMediaItem albumMediaItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("72b565fa", new Object[]{this, albumMediaItem});
        }
        if (albumMediaItem == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (q.a(albumMediaItem.imgFilePath)) {
            hashMap.put("picType", "screenshot");
        } else {
            hashMap.put("picType", "common");
        }
        hashMap.put("intervalTime", String.valueOf(System.currentTimeMillis() - (Long.parseLong(albumMediaItem.lastUpdateTime) * 1000)));
        return hashMap;
    }

    @Override // com.etao.feimagesearch.cip.capture.components.b.InterfaceC0224b
    public void onRecentImageShow(List<AlbumMediaItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6bab76", new Object[]{this, list});
            return;
        }
        a aVar = this.listener.get();
        if (aVar == null) {
            return;
        }
        AlbumMediaItem albumMediaItem = (list == null || list.size() <= 0) ? null : list.get(0);
        String str = "";
        if (this.alwaysShow) {
            if (aVar instanceof b) {
                ((b) aVar).a(list, null);
                return;
            }
            if (albumMediaItem != null) {
                str = albumMediaItem.imgUri.toString();
            }
            aVar.a(str, true, generateLocalFileTrace(albumMediaItem));
        } else if (albumMediaItem != null && albumMediaItem.canShow && albumMediaItem.imgUri != null) {
            this.localImageList = list;
            if (aVar instanceof b) {
                ((b) aVar).a(this.localImageList, null);
            } else {
                aVar.a(albumMediaItem.imgUri.toString(), true, generateLocalFileTrace(albumMediaItem));
            }
        } else if (this.needFootprint) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("_input_charset", "UTF-8");
            arrayMap.put("_output_charset", "UTF-8");
            arrayMap.put("historysource", BlobManager.BLOB_ELEM_TYPE_CAMERA);
            arrayMap.put("n", "1");
            arrayMap.put("ttid", com.c());
            arrayMap.put("sversion", com.h());
            arrayMap.put("page", "1");
            arrayMap.put("api", com.etao.feimagesearch.config.b.I());
            arrayMap.put("last_visit_time", cuj.b(com.b(), KEY_LAST_VISIT_TIME, str));
            arrayMap.put("last_visit_item_id", cuj.b(com.b(), KEY_LAST_VISIT_ITEM_ID, str));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("params", (Object) JSON.toJSONString(arrayMap));
            } catch (Exception e) {
                cot.d("ImagePopTask", e.getLocalizedMessage());
            }
            jSONObject.put("appId", (Object) "23921");
            w.a(com.etao.feimagesearch.config.b.I(), com.etao.feimagesearch.config.b.J(), jSONObject, new IRemoteBaseListener() { // from class: com.etao.feimagesearch.ImagePopTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    a aVar2 = (a) ImagePopTask.access$000(ImagePopTask.this).get();
                    if (aVar2 == null) {
                        return;
                    }
                    try {
                        ctd a2 = com.etao.feimagesearch.cip.capture.components.a.a(mtopResponse.getDataJsonObject());
                        List<ctd> b2 = aVar2 instanceof b ? com.etao.feimagesearch.cip.capture.components.a.b(mtopResponse.getDataJsonObject()) : null;
                        if (a2 == null) {
                            if (aVar2 instanceof b) {
                                ((b) aVar2).a(null, null);
                            } else {
                                aVar2.a("", true, null);
                            }
                        } else if (StringUtils.isEmpty(a2.f26508a)) {
                        } else {
                            k.a(com.b(), ImagePopTask.KEY_LAST_VISIT_TIME, String.valueOf(System.currentTimeMillis()));
                            k.a(com.b(), ImagePopTask.KEY_LAST_VISIT_ITEM_ID, a2.c);
                            if (aVar2 instanceof b) {
                                ((b) aVar2).a(null, b2);
                            } else {
                                aVar2.a(a2.f26508a, false, a2.b());
                            }
                        }
                    } catch (Exception e2) {
                        cot.d("ImagePopTask", e2.getLocalizedMessage());
                        if (!(aVar2 instanceof b)) {
                            return;
                        }
                        ((b) aVar2).a(null, null);
                    }
                }
            }, false, true, false);
        } else if (aVar instanceof b) {
            ((b) aVar).a(null, null);
        } else {
            aVar.a(str, true, null);
        }
    }
}
