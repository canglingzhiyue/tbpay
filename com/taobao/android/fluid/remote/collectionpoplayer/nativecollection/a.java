package com.taobao.android.fluid.remote.collectionpoplayer.nativecollection;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.c;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.remote.collectionpoplayer.Request.CollectRequest;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.SpeedAdustableRecylerView;
import com.taobao.taobao.R;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.kox;
import tb.koz;
import tb.obo;
import tb.ocb;
import tb.oec;
import tb.slk;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12678a = 0;
    private ArrayList<com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b> b;
    private SpeedAdustableRecylerView c;
    private FluidContext d;
    private CollectionTabLayout e;
    private String f;
    private List g;
    private koz h;

    static {
        kge.a(-499996917);
    }

    public static /* synthetic */ koz a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (koz) ipChange.ipc$dispatch("dd8e2a9e", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ void a(a aVar, slk.a aVar2, String str, boolean z, int i, boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82728f4b", new Object[]{aVar, aVar2, str, new Boolean(z), new Integer(i), zArr});
        } else {
            aVar.a(aVar2, str, z, i, zArr);
        }
    }

    public static /* synthetic */ CollectionTabLayout b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CollectionTabLayout) ipChange.ipc$dispatch("a5fe50bb", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ FluidContext c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("f61a32b8", new Object[]{aVar}) : aVar.d;
    }

    public a(ArrayList<com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b> arrayList, SpeedAdustableRecylerView speedAdustableRecylerView, FluidContext fluidContext, CollectionTabLayout collectionTabLayout, koz kozVar, String str, List list) {
        this.b = arrayList;
        this.c = speedAdustableRecylerView;
        this.d = fluidContext;
        this.e = collectionTabLayout;
        this.h = kozVar;
        this.f = str;
        this.g = list;
    }

    public void a(koz kozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1801f82", new Object[]{this, kozVar});
        } else {
            this.h = kozVar;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f12678a = i;
        }
    }

    public void a(int i, int i2, int i3, slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d6a41c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), aVar});
            return;
        }
        ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> convertToMediaSetDataArrayList = ((IDataService) this.d.getService(IDataService.class)).convertToMediaSetDataArrayList(aVar);
        int i4 = i2 - 1;
        if (i == i4) {
            a(convertToMediaSetDataArrayList, true, false);
            spz.c("PopupDialog", "加入setlist, target.size" + aVar.f33700a.size() + "终止ID：" + aVar.f33700a.get(aVar.f33700a.size() - 1).sequenceNumber);
            return;
        }
        int i5 = i3 + 1;
        if (i == i5) {
            a(convertToMediaSetDataArrayList, false, false);
            spz.c("PopupDialog", "加入setlist, target.size" + aVar.f33700a.size() + "起始ID：" + aVar.f33700a.get(0).sequenceNumber);
        } else if (i > i5 || i < i4) {
            spz.c("PopupDialog", "隔断内容不需插入现有mMediaSetList" + this.b.size());
        } else {
            spz.c("PopupDialog", "请求的内容和原有内容重合");
        }
    }

    public void a(ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1df5042", new Object[]{this, arrayList, new Boolean(z), new Boolean(z2)});
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == null || arrayList.get(i).a() == null || arrayList.get(i).a().d == null || arrayList.get(i).a().p() == null) {
                spz.c("PopupDialog", "mediaSetList.get(i) is null" + arrayList.get(i));
            } else {
                JSONObject jSONObject = (JSONObject) arrayList.get(i).a().d.get("extraData");
                if (jSONObject != null) {
                    JSONObject jSONObject2 = (JSONObject) jSONObject.get("collectionData");
                    if (jSONObject2 != null) {
                        String string = jSONObject2.getString("coverUrl");
                        String string2 = jSONObject2.getString("index");
                        String string3 = jSONObject2.getString("contentTitle");
                        if (string3 == null) {
                            string3 = jSONObject2.getString("collectionName");
                        }
                        a(string2);
                        String string4 = jSONObject2.getString("durationStr");
                        String g = arrayList.get(i).a().g();
                        String string5 = jSONObject2.getString("interactionLikeCount");
                        MediaContentDetailData.PlayletInfo p = arrayList.get(i).a().p();
                        com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b bVar = new com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b(string2 + " | " + string3, string4 + "", string, g, ocb.a(string2), string5, p != null ? p.free : true, p != null ? p.locked : false);
                        if (p != null) {
                            bVar.i = p.contentPayableImgUrl;
                            bVar.j = oec.a((Object) p.tagWidth, 0);
                            bVar.k = oec.a((Object) p.tagHeight, 0);
                        }
                        arrayList2.add(bVar);
                    }
                } else {
                    FluidException.throwException(this.d, ICollectionService.INSTANCE_PARSE_ERROR);
                }
            }
        }
        if (z2) {
            this.b.clear();
            this.c.getAdapter().notifyDataSetChanged();
            this.b.addAll(arrayList2);
            this.c.getAdapter().notifyDataSetChanged();
        } else if (z) {
            SpeedAdustableRecylerView speedAdustableRecylerView = this.c;
            if (speedAdustableRecylerView == null || speedAdustableRecylerView.getAdapter() == null) {
                return;
            }
            this.b.addAll(0, arrayList2);
            spz.c("PopupDialog", "notifyItemRangeInserted:" + this.b.size() + "," + arrayList2.size());
            this.c.getAdapter().notifyItemRangeInserted(0, arrayList2.size());
        } else {
            SpeedAdustableRecylerView speedAdustableRecylerView2 = this.c;
            if (speedAdustableRecylerView2 == null || speedAdustableRecylerView2.getAdapter() == null) {
                return;
            }
            this.b.addAll(arrayList2);
            int size = this.b.size() - arrayList2.size();
            spz.c("PopupDialog", "notifyItemRangeInserted:" + this.b.size() + "," + arrayList2.size() + "startIndex:" + size);
            this.c.getAdapter().notifyItemRangeInserted(size, arrayList2.size());
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (oec.a((Object) str, 0) == this.f12678a && this.e.getTabsContainer().getChildCount() == 1 && this.e.getSelectedTabPosition() == 1 && kox.a(this.f)) {
            oec.a(new Runnable() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.a(a.this).a(8);
                    if (a.b(a.this).getSelectedTabPosition() != 1) {
                        return;
                    }
                    a.a(a.this).a(a.this.f12678a + 1, 0);
                }
            });
        }
        if (oec.a((Object) str, 0) != 1 || this.e.getTabsContainer().getChildCount() != 1 || this.e.getSelectedTabPosition() != 0 || !kox.a(this.f)) {
            return;
        }
        oec.a(new Runnable() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.a(a.this).a(8);
                if (a.b(a.this).getSelectedTabPosition() != 0) {
                    return;
                }
                a.a(a.this).a(1, 0);
            }
        });
    }

    public void a(final int i, final boolean z, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621338a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        } else if (i2 == 0) {
        } else {
            ((IDataService) this.d.getService(IDataService.class)).requestListForCollection(z, null, i, new com.taobao.android.fluid.core.a<slk.a>() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.core.a
                public void a(slk.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17894309", new Object[]{this, aVar});
                        return;
                    }
                    int i3 = i2;
                    if (i3 <= 0) {
                        return;
                    }
                    a.this.a(i, z, i3 - 1);
                }
            });
        }
    }

    public void a(slk.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99fd0eb", new Object[]{this, aVar, new Boolean(z)});
        } else if (aVar == null) {
        } else {
            com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.d.getService(IDataService.class)).getCurrentMediaSetData();
            if (this.b.size() == 0 || currentMediaSetData == null || currentMediaSetData.a() == null) {
                return;
            }
            int a2 = aVar.a(z);
            spz.c("PopupDialog", "收到addList消息:" + a2 + " isTop:" + z + "isEmpty: " + aVar.c());
            StringBuilder sb = new StringBuilder();
            sb.append("target.list.size");
            sb.append(aVar.f33700a.size());
            spz.c("PopupDialog", sb.toString());
            int a3 = this.b.get(0).a();
            ArrayList<com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b> arrayList = this.b;
            a(a2, a3, arrayList.get(arrayList.size() - 1).a(), aVar);
        }
    }

    public void a(final boolean z, final int i, final int i2, final boolean[] zArr, final int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971a33b8", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), zArr, new Integer(i3)});
            return;
        }
        IDataService iDataService = (IDataService) this.d.getService(IDataService.class);
        if (iDataService == null) {
            return;
        }
        iDataService.requestListForCollection(z, null, i, new com.taobao.android.fluid.core.a<slk.a>() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.core.a
            public void a(slk.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17894309", new Object[]{this, aVar});
                    return;
                }
                zArr[i3] = true;
                if (aVar == null) {
                    return;
                }
                a.a(a.this, aVar, String.valueOf(i), z, i2, zArr);
            }
        });
    }

    private void a(slk.a aVar, String str, boolean z, int i, boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9db94e1", new Object[]{this, aVar, str, new Boolean(z), new Integer(i), zArr});
            return;
        }
        ((ICollectionService) this.d.getService(ICollectionService.class)).collectionPagingInsertData(ocb.a(str), aVar, aVar.a(false));
        ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> a2 = obo.a(((ICollectionService) this.d.getService(ICollectionService.class)).getCollectionMap(), ocb.a(str), true);
        ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> a3 = obo.a(((ICollectionService) this.d.getService(ICollectionService.class)).getCollectionMap(), ocb.a(str), false);
        ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList = new ArrayList<>();
        if (this.e.getSelectedTabPosition() < this.g.size() && ocb.a(a((JSONObject) this.g.get(this.e.getSelectedTabPosition()))) != i) {
            return;
        }
        if (this.e.getSelectedTabPosition() == this.g.size() && i != this.f12678a + 1) {
            return;
        }
        arrayList.addAll(a2);
        arrayList.addAll(a2.size(), a3);
        a(arrayList, z, true);
        if (!zArr[0] || !zArr[1] || i <= 0) {
            return;
        }
        b(i);
    }

    private void b(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        spz.c("PopupDialog", "updateCellectionAfterTabSelected");
        this.c.post(new Runnable() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.a(a.this).a(i, 0);
                a.a(a.this).a(8);
            }
        });
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject}) : jSONObject.getString("start");
    }

    public void a(View view, final PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd27cdd", new Object[]{this, view, popupDialog});
        } else {
            ((LinearLayout) view.findViewById(R.id.shareCollection)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.a.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    JSONObject a2 = a.this.a();
                    if (a2 == null) {
                        a2 = new JSONObject();
                    }
                    String string = a2.getString("coverUrl");
                    ShareContent shareContent = new ShareContent();
                    shareContent.businessId = "guangguang";
                    shareContent.description = "我分享给你了一个淘宝页面，快来看看吧";
                    HashMap hashMap = new HashMap();
                    hashMap.put("title", a2.getString("title"));
                    hashMap.put("userNick", a2.getString("accountName"));
                    hashMap.put("headImg", a2.getString("avatarUrl"));
                    hashMap.put("images", new String[]{string});
                    shareContent.templateParams = hashMap;
                    shareContent.imageUrl = string;
                    JSONObject jSONObject = new JSONObject();
                    if (((IDataService) a.c(a.this).getService(IDataService.class)).getCurrentMediaDetail() != null) {
                        jSONObject.put("contentId", (Object) ((IDataService) a.c(a.this).getService(IDataService.class)).getCurrentMediaDetail().g());
                    }
                    jSONObject.put("sceneSource", (Object) "guang_share");
                    ISceneConfigService iSceneConfigService = (ISceneConfigService) a.c(a.this).getService(ISceneConfigService.class);
                    if (iSceneConfigService != null && iSceneConfigService.getSessionParams() != null) {
                        jSONObject.put("spm-url", (Object) iSceneConfigService.getSessionParams().e);
                    }
                    String str = "https://web.m.taobao.com/app/tnode/web/index?tnode=page_guangguanghome&tabid=video&extParams=" + Uri.encode(jSONObject.toJSONString());
                    shareContent.url = str;
                    spz.c("PopupDialog", "shareUrl" + str);
                    if (((IDataService) a.c(a.this).getService(IDataService.class)).getCurrentMediaDetail() != null) {
                        shareContent.title = ((IDataService) a.c(a.this).getService(IDataService.class)).getCurrentMediaDetail().C();
                    }
                    shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("userNick", a2.getString("accountName"));
                    hashMap2.put("avatarPath", a2.getString("avatarUrl"));
                    shareContent.extendParams = hashMap2;
                    ShareBusiness.getInstance();
                    ShareBusiness.share((Activity) popupDialog.getContext(), shareContent);
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put(PopupDialog.X_INDEX, String.valueOf(a2.get("index")));
                    hashMap3.put(PopupDialog.X_POSITION, String.valueOf(((IDataService) a.c(a.this).getService(IDataService.class)).getCurrentMediaPosition()));
                    com.taobao.android.fluid.business.usertrack.track.b.b(null, "Button-ShareCollection", hashMap3);
                    popupDialog.dismissAllowingStateLoss();
                }
            });
        }
    }

    public JSONObject a() {
        a.c currentMediaDetail;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        FluidContext fluidContext = this.d;
        if (fluidContext != null && fluidContext.getService(IDataService.class) != null && (currentMediaDetail = ((IDataService) this.d.getService(IDataService.class)).getCurrentMediaDetail()) != null && currentMediaDetail.d != null && (jSONObject = (JSONObject) currentMediaDetail.d.get("extraData")) != null) {
            return (JSONObject) jSONObject.get("collectionData");
        }
        return null;
    }

    public void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        CollectRequest collectRequest = new CollectRequest();
        collectRequest.setApiName(collectRequest.getApi());
        collectRequest.setNeedEcode(false);
        collectRequest.setNeedSession(false);
        collectRequest.setVersion(collectRequest.getVersion());
        collectRequest.setEntityId(z ? "99771" : "99769");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject a2 = a();
        if (a2 != null) {
            jSONObject2.put(PopupDialog.COLLECTION_ID, a2.get(PopupDialog.COLLECTION_ID));
        }
        jSONObject2.put("source", (Object) "common_collection_VIDEO_TAB");
        collectRequest.setParams(jSONObject2.toJSONString());
        FluidSDK.getMTopAdapter().send(c.a.a().a(jSONObject).a(collectRequest).a(new IMTopAdapter.b() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.a.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
            public void a(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5b39cfcd", new Object[]{this, mtopResponse, baseOutDo});
                    return;
                }
                a.a(a.this).a(!z);
                spz.c("PopupDialog", "collectLinearLayout.setOnClickListener onCall" + mtopResponse.toString());
            }

            @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    return;
                }
                spz.c("PopupDialog", "collectLinearLayout.setOnClickListener onError" + mtopResponse.toString());
            }
        }).a((IMTopAdapter.a) null).b(true).a(MediaMixContentDetailResponse.class).b());
    }

    public void b(boolean z) {
        IMessageService iMessageService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        FluidContext fluidContext = this.d;
        if (fluidContext == null || (iMessageService = (IMessageService) fluidContext.getService(IMessageService.class)) == null || this.d.getService(IDataService.class) == null) {
            return;
        }
        a.c currentMediaDetail = ((IDataService) this.d.getService(IDataService.class)).getCurrentMediaDetail();
        String str = currentMediaDetail != null ? currentMediaDetail.c : "";
        HashMap hashMap = new HashMap();
        hashMap.put("loop", z ? "1" : "0");
        iMessageService.sendMessage(new spy("VSMSG_setForceLoop", str, hashMap));
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        int childAdapterPosition = this.c.getChildAdapterPosition(view);
        HashMap hashMap = new HashMap();
        if (childAdapterPosition < 0 || childAdapterPosition >= this.b.size()) {
            return;
        }
        hashMap.put(PopupDialog.X_INDEX, String.valueOf(this.b.get(childAdapterPosition).a()));
        hashMap.put(PopupDialog.X_POSITION, String.valueOf(childAdapterPosition));
        com.taobao.android.fluid.business.usertrack.track.b.c(this.d, "Page_videointeract_Show-collection", hashMap);
    }
}
