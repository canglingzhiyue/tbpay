package com.taobao.tao.sharepanel.weex;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.widget.PopupWindow;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.render.b;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.share.ui.engine.weex.c;
import com.taobao.statistic.TBS;
import com.taobao.tao.channel.ChannelInfo;
import com.taobao.tao.channel.b;
import com.taobao.tao.util.AnalyticsUtil;
import com.taobao.tao.util.SpUtils;
import com.taobao.vessel.VesselView;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.nyh;
import tb.nys;
import tb.nzi;
import tb.nzo;
import tb.obh;
import tb.obj;
import tb.oie;
import tb.oub;
import tb.ouo;
import tb.oup;

/* loaded from: classes8.dex */
public class a extends oub implements nzi.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_SHOW_CHANNEL_TYPE_KEY = "ShowChannelType";

    /* renamed from: a */
    public obj f21064a;
    public String b;

    static {
        kge.a(317973034);
        kge.a(1048998858);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ b a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("db050ecd", new Object[]{aVar}) : aVar.mSharePanel;
    }

    public a(String str) {
        this.b = str;
    }

    @Override // tb.oub
    public void initSharePanel(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4f16ee", new Object[]{this, activity});
            return;
        }
        com.taobao.android.share.resource.a a2 = com.taobao.android.share.resource.a.a();
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELINITSHAREPANELSTART);
        if (ShareBizAdapter.getInstance().getContactsInfoProvider() != null) {
            ShareBizAdapter.getInstance().getContactsInfoProvider().a();
        }
        TBShareContent a3 = this.mShareContext.a();
        com.taobao.tao.channel.b.a().a(a3, (b.a) this, false);
        this.f21064a = new obj();
        ouo.a();
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELINITSHAREPANELEND);
        if (a3 != null && obh.e(a3.businessId)) {
            String str = a3.businessId;
            this.b = obh.w();
            WeexBizView b = c.b(activity, this.b, this, str);
            this.mSharePanel = new com.taobao.share.ui.engine.render.b(activity);
            a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELSHOWWEEX2START);
            this.mSharePanel.a(b);
        } else {
            VesselView a4 = c.a(activity, this.b, this, "");
            this.mSharePanel = new com.taobao.share.ui.engine.render.b(activity);
            this.mSharePanel.a(a4);
        }
        this.mSharePanel.a(new PopupWindow.OnDismissListener() { // from class: com.taobao.tao.sharepanel.weex.WeexSharePanel$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    return;
                }
                a.a(a.this).b();
                a.this.f21064a.c();
                com.taobao.tao.channel.b.a().a((List<com.taobao.share.globalmodel.b>) null);
            }
        });
        this.mShareActionDispatcher.a(this.mSharePanel);
        if (obh.e(a3.businessId)) {
            this.mShareActionDispatcher.b();
        } else {
            this.mShareActionDispatcher.a();
        }
    }

    @Override // tb.oub
    public void initPanelData(TBShareContent tBShareContent, com.taobao.tao.channel.a aVar, String str, int i, boolean z, String str2, String str3, String str4) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3deb0dfb", new Object[]{this, tBShareContent, aVar, str, new Integer(i), new Boolean(z), str2, str3, str4});
            return;
        }
        com.taobao.android.share.resource.a a2 = com.taobao.android.share.resource.a.a();
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELINITSHAREPANELDATASTART);
        String b = nys.b(CACHE_SHOW_CHANNEL_TYPE_KEY, "2");
        String str7 = "";
        if (StringUtils.equals("2", b)) {
            nyh.b("2");
            com.taobao.tao.channel.b.a().a(com.taobao.tao.channel.b.a().a((List<com.taobao.share.globalmodel.a>) aVar.a(), this.mShareContext, false));
            Map<String, List<ChannelInfo>> b2 = com.taobao.tao.channel.b.a().b(aVar.a(), this.mShareContext);
            if (b2 != null) {
                str7 = JSON.toJSONString(b2.get(com.taobao.tao.channel.b.CHANNEL_LIST_KEY));
                str6 = JSON.toJSONString(b2.get(com.taobao.tao.channel.b.TOOL_LIST_KEY));
            } else {
                str6 = str7;
            }
            str5 = str6;
        } else {
            nyh.b("1");
            this.f21064a.a(com.taobao.tao.channel.b.a().a((List<com.taobao.share.globalmodel.a>) aVar.a(), this.mShareContext, true));
            this.f21064a.b(com.taobao.tao.channel.b.a().c(aVar.a(), this.mShareContext, false));
            str7 = str7;
            str5 = str7;
        }
        oup.a(tBShareContent, str7, str5, str, i, z, str2, b);
        nys.a(CACHE_SHOW_CHANNEL_TYPE_KEY, str3);
        a(tBShareContent, str4);
        if (!z) {
            oup.a();
        } else if (StringUtils.equals("2", str2)) {
            nyh.a("2");
            oie.a(null, null);
        } else {
            nyh.a("1");
            oie.a(this, null);
        }
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELINITSHAREPANELDATAEND);
    }

    private void a(TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a226d18f", new Object[]{this, tBShareContent, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            nzo shareWeexSdk = ShareBizAdapter.getInstance().getShareWeexSdk(tBShareContent != null ? tBShareContent.businessId : "");
            if (shareWeexSdk != null) {
                shareWeexSdk.b();
            }
            oup.a(str, tBShareContent);
        }
    }

    @Override // tb.nzi.a
    public void onFriendsProvider(Object obj, Object obj2, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba85066", new Object[]{this, obj, obj2, new Integer(i), new Integer(i2)});
            return;
        }
        List<com.taobao.share.globalmodel.b> list = (List) obj;
        this.f21064a.a((BubbleTipsBean) obj2);
        TBShareContent j = e.b().j();
        if (j == null) {
            return;
        }
        String str = j.businessId + "," + j.templateId + "," + ShareBizAdapter.getInstance().getLogin().a();
        if (list == null || list.size() <= 0) {
            oup.a();
            TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Contact_NoData", j != null ? j.businessId : "", null, str);
            return;
        }
        for (com.taobao.share.globalmodel.b bVar : list) {
            bVar.a(this.mShareContext);
        }
        this.f21064a.c(list);
        boolean z2 = i > 0 && list.size() - 1 > i;
        if (!SpUtils.getGuide(com.taobao.tao.config.a.a(), SpUtils.START_GUIDE_NEW) && !StringUtils.equals("common", j.templateId)) {
            z = true;
        }
        if (z2 && z) {
            oup.b();
            SpUtils.cacheSaveGuide(SpUtils.START_GUIDE_NEW, true);
        }
        AnalyticsUtil.contactShowEvent(list, j, e.b().k(), str);
    }

    public obj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (obj) ipChange.ipc$dispatch("f089707", new Object[]{this}) : this.f21064a;
    }
}
