package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.b;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.sharepanel.weex.a;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.obj;
import tb.ouc;

/* loaded from: classes8.dex */
public abstract class AbsListComponent extends WXComponent<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FINAL_CHANCE = 2;
    public boolean customCopy;
    public int dataSetChance;
    public boolean isHasInitData;
    private boolean isImageShare;
    private boolean isNeedAnimate;
    private JSONObject itemStyle;
    public List<b> mComponents;
    public obj mDataBinder;
    private boolean mIncludeToolFlag;

    static {
        kge.a(1679443299);
    }

    public static /* synthetic */ Object ipc$super(AbsListComponent absListComponent, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract String getComponentKey();

    public AbsListComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mDataBinder = ((a) ShareBizAdapter.getInstance().getShareEngine().mo1241getCurSharePanel()).f21064a;
        this.customCopy = "true".equals(basicComponentData.getAttrs().get("customCopy"));
        boolean equals = "true".equals(basicComponentData.getAttrs().get("customJump"));
        this.isNeedAnimate = "true".equals(basicComponentData.getAttrs().get("needAnimate"));
        this.isImageShare = "true".equals(basicComponentData.getAttrs().get("imageShare"));
        this.mIncludeToolFlag = "true".equals(basicComponentData.getAttrs().get("includeTool"));
        if (this instanceof ShareChannelView) {
            boolean z = this.customCopy;
            com.taobao.share.taopassword.constants.a.b = z;
            if (this.mIncludeToolFlag) {
                com.taobao.share.taopassword.constants.a.c = z;
                com.taobao.share.taopassword.constants.a.d = equals;
            }
        }
        Object obj = basicComponentData.getAttrs().get("itemStyle");
        if (obj != null) {
            this.itemStyle = JSON.parseObject(String.valueOf(obj));
        }
        this.dataSetChance = 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView */
    public RecyclerView mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("e4d41cdd", new Object[]{this, context});
        }
        RecyclerView recyclerView = new RecyclerView(context);
        if (this.isNeedAnimate) {
            recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(recyclerView.getContext(), R.anim.layout_animation_fall_down));
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (this.mComponents == null) {
            this.mComponents = new ArrayList();
        } else {
            this.isHasInitData = true;
        }
        recyclerView.setAdapter(new ouc(recyclerView.getContext(), this.mComponents, true, this.itemStyle));
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        initDone();
        return recyclerView;
    }

    @WXComponentProp(name = "list")
    public void onComponentData(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8533de20", new Object[]{this, list});
            return;
        }
        this.mComponents = getComponentList(list);
        RecyclerView hostView = mo1286getHostView();
        if (hostView == null) {
            return;
        }
        if (!this.isHasInitData) {
            if (this.isNeedAnimate) {
                hostView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(hostView.getContext(), R.anim.layout_animation_fall_down));
            }
            ouc oucVar = (ouc) hostView.getAdapter();
            oucVar.a(this.mComponents);
            oucVar.notifyDataSetChanged();
        }
        initDone();
    }

    public void initDone() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc40d039", new Object[]{this});
            return;
        }
        this.dataSetChance++;
        List<b> list = this.mComponents;
        if (list != null && list.size() > 0) {
            z = true;
        }
        if (this.dataSetChance != 2) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) getComponentKey());
        if (!z) {
            i = -1;
        }
        jSONObject.put("state", (Object) Integer.valueOf(i));
        com.taobao.share.ui.engine.jsbridge.a.a().a(com.taobao.share.ui.engine.jsbridge.a.DATA_STATE_EVENT, jSONObject);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        this.mDataBinder = null;
    }

    private List<b> getComponentList(List<b> list) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98ce022a", new Object[]{this, list});
        }
        if (this.mIncludeToolFlag || !(this instanceof ShareChannelView)) {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar : list) {
            if (bVar instanceof com.taobao.share.ui.engine.structure.a) {
                com.taobao.share.ui.engine.structure.a aVar = (com.taobao.share.ui.engine.structure.a) bVar;
                aVar.e = this.isImageShare;
                if (z && aVar.d().j()) {
                }
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
