package com.taobao.android.searchbaseframe.nx3.bean;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.u;
import com.taobao.android.searchbaseframe.util.v;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes6.dex */
public class MuiseCellBean extends BaseCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final v<MuiseCellBean> BEAN_MAP;
    private static final u<MuiseCellBean> ID_BEAN_MAP;
    private static final AtomicInteger INSTANCE_ID_COUNTER;
    public MuiseBean mMuiseBean;
    public String ndPreviewUrl;
    public final Map<String, Object> mStorage = new HashMap();
    public boolean mStorageUpdated = false;
    public boolean videoPlayable = false;
    public boolean videoForcePlay = false;
    public boolean hasPreRequestDetail = false;
    public boolean ndPreview = false;
    public boolean ndPreviewTriggered = false;
    public final Map<String, Object> mExtraObj = new HashMap();
    public boolean requestLayout = false;
    public boolean layoutCalcDone = false;
    public final int beanId = INSTANCE_ID_COUNTER.incrementAndGet() % Integer.MAX_VALUE;
    public boolean invisibleCell = false;

    public static /* synthetic */ Object ipc$super(MuiseCellBean muiseCellBean, String str, Object... objArr) {
        if (str.hashCode() == -853395924) {
            return super.mo1013copy();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MuiseCellBean() {
        BEAN_MAP.a(this.beanId, this);
    }

    static {
        kge.a(-1421634694);
        INSTANCE_ID_COUNTER = new AtomicInteger(0);
        BEAN_MAP = new v<>();
        ID_BEAN_MAP = new u<>();
    }

    public static MuiseCellBean findById(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MuiseCellBean) ipChange.ipc$dispatch("c8247648", new Object[]{new Integer(i)}) : BEAN_MAP.a(i);
    }

    public static MuiseCellBean findByLongId(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MuiseCellBean) ipChange.ipc$dispatch("f45087ad", new Object[]{new Long(j)}) : ID_BEAN_MAP.a(j);
    }

    public static void recordLongId(long j, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6223f2", new Object[]{new Long(j), muiseCellBean});
        } else {
            ID_BEAN_MAP.a(j, muiseCellBean);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    /* renamed from: copyCellBean */
    public <T extends BaseCellBean> T mo1014copyCellBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8656331a", new Object[]{this}) : new MuiseCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    /* renamed from: copy  reason: collision with other method in class */
    public MuiseCellBean mo1013copy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseCellBean) ipChange.ipc$dispatch("9f0a3af3", new Object[]{this});
        }
        MuiseCellBean muiseCellBean = (MuiseCellBean) super.mo1013copy();
        muiseCellBean.mMuiseBean = new MuiseBean();
        this.mMuiseBean.copy(muiseCellBean.mMuiseBean);
        muiseCellBean.mExtraObj.putAll(this.mExtraObj);
        muiseCellBean.mStorage.putAll(this.mStorage);
        muiseCellBean.videoPlayable = this.videoPlayable;
        muiseCellBean.videoForcePlay = this.videoForcePlay;
        return muiseCellBean;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    public void copyCellData(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a883e99a", new Object[]{this, baseCellBean});
        } else if (!(baseCellBean instanceof MuiseCellBean)) {
        } else {
            MuiseCellBean muiseCellBean = (MuiseCellBean) baseCellBean;
            muiseCellBean.mStorage.putAll(this.mStorage);
            MuiseBean muiseBean = muiseCellBean.mMuiseBean;
            if (muiseBean != null && this.mMuiseBean != null) {
                muiseBean.mStorage.putAll(this.mMuiseBean.mStorage);
            }
            MuiseBean muiseBean2 = muiseCellBean.mMuiseBean;
            if (muiseBean2 == null || this.mMuiseBean == null) {
                return;
            }
            muiseBean2.updateCachedHeight(ListStyle.LIST, this.mMuiseBean.getCachedHeight(ListStyle.LIST));
            muiseCellBean.mMuiseBean.updateCachedHeight(ListStyle.WATERFALL, this.mMuiseBean.getCachedHeight(ListStyle.WATERFALL));
        }
    }
}
