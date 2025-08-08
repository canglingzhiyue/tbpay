package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.contacts.data.member.RecentMember;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.b;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.friends.model.ContactType;
import com.taobao.tao.friends.model.a;
import com.taobao.tao.util.UTAnalyticsHelper;
import com.taobao.taolive.room.utils.ag;
import com.ut.share.business.ShareTargetType;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes8.dex */
public class ois extends oio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1474102100);
    }

    public ois(oif oifVar) {
        super(oifVar);
    }

    @Override // tb.oio
    public boolean b(Context context, b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3095705c", new Object[]{this, context, bVar, new Integer(i), bVar2})).booleanValue();
        }
        return StringUtils.equals((bVar == null ? ComponentType.CONTACT_ITEM : bVar.c()).desc, ComponentType.CONTACT_ITEM.desc);
    }

    @Override // tb.oio
    public void c(Context context, b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92230b7", new Object[]{this, context, bVar, new Integer(i), bVar2});
            return;
        }
        TBShareContent j = e.b().j();
        if (j != null && (bVar instanceof a)) {
            a aVar = (a) bVar;
            com.taobao.tao.friends.model.b i2 = aVar.i();
            String str2 = "";
            oup.a(bVar.b(), str2, JSON.toJSONString(aVar.g()));
            if (i2.c == ContactType.LINK && !StringUtils.isEmpty(aVar.h())) {
                Nav.from(context).toUri(aVar.h());
                if (AgooConstants.ACK_PACK_NOBIND.equals(i2.d)) {
                    TBS.Ext.commitEvent("Page_Share", 19999, "Page_Detail_creatgroup_click", (Object) null, (Object) null);
                }
            } else {
                if (aVar.g() != null) {
                    str = aVar.g().getUserId();
                    if (StringUtils.isEmpty(str)) {
                        str = aVar.g().getCcode();
                    }
                } else {
                    str = str2;
                }
                String contactClickEventName = UTAnalyticsHelper.getContactClickEventName(aVar);
                if (!StringUtils.isEmpty(contactClickEventName)) {
                    TBS.Ext.commitEvent("Page_Share", 19999, contactClickEventName, j.businessId, str, j.businessId + "," + j.templateId + "," + ShareBizAdapter.getInstance().getLogin().a() + "," + bVar.b() + ",");
                }
                String str3 = j.url;
                if ("detail".equals(j.templateId)) {
                    str3 = e.b().f();
                } else if ("shop".equals(j.templateId)) {
                    try {
                        str3 = j.url.split(".")[0].split("shop")[1];
                    } catch (Throwable unused) {
                    }
                }
                String str4 = "shareTraceId=" + aVar.d() + ",userId=" + ShareBizAdapter.getInstance().getLogin().a() + ",targetUserId=" + str + ",position=" + (i + 1) + ",timeStamp=" + System.currentTimeMillis() + ",shareContent=" + str3 + ",templateId=" + j.templateId + ",pvid=" + aVar.e() + "," + ag.ARG_SCM + aVar.f();
                if (j != null) {
                    str2 = j.businessId;
                }
                TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Friends_click", str2, null, str4);
                RecentMember g = aVar.g();
                if (g == null) {
                    oig.a(ShareTargetType.Share2Contact.getValue(), null);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", g.getName());
                    hashMap.put("userId", g.getUserId());
                    hashMap.put("headUrl", g.getHeadUrl());
                    hashMap.put("timeStamp", String.valueOf(g.getTimeStamp()));
                    hashMap.put("phone", g.getPhone());
                    hashMap.put("taoFlag", g.getTaoFlag());
                    hashMap.put("taoFriendName", g.getTaoFriendName());
                    if (g.isTaoFriend()) {
                        hashMap.put("taoFriend", "true");
                    } else {
                        hashMap.put("taoFriend", "false");
                    }
                    hashMap.put("type", String.valueOf(g.getType()));
                    hashMap.put("ccode", g.getCcode());
                    hashMap.put("recordNum", String.valueOf(g.getRecordNum()));
                    oig.a(ShareTargetType.Share2Contact.getValue(), hashMap);
                }
            }
        } else {
            oig.a(ShareTargetType.Share2Contact.getValue(), null);
        }
        if (bVar2 == null) {
            return;
        }
        bVar2.a();
    }
}
