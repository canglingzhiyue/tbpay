package tb;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.y;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.datasource.bean.ReviewBean;
import com.taobao.search.mmd.util.e;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import java.util.List;

/* loaded from: classes8.dex */
public class ntw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31761a;

    static {
        kge.a(-1209377766);
        f31761a = ntw.class.getSimpleName();
    }

    public static void a(c cVar, ReviewBean reviewBean, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e97b7d", new Object[]{cVar, reviewBean, context});
        } else if (reviewBean == null || StringUtils.isEmpty(reviewBean.h5Url)) {
            Log.e(f31761a, "review bean is null");
        } else if (cVar == null) {
            Log.e(f31761a, "datasource is null");
        } else if (context == null) {
            Log.e(f31761a, "context is null");
        } else {
            ArrayMap<String, String> a2 = a(cVar, reviewBean.totalPage * 10);
            if (a2 == null) {
                a2 = new ArrayMap<>();
            }
            a2.put("q", cVar.getKeyword());
            String valueOf = String.valueOf(cVar.hashCode());
            if (!StringUtils.isEmpty(valueOf)) {
                a2.put("srpKey", valueOf);
            }
            CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getLastSearchResult();
            if (commonSearchResult != null) {
                a2.put("bucketId", commonSearchResult.getMainInfo().abtest);
                a2.put("last_page", String.valueOf(commonSearchResult.getMainInfo().page));
                a2.put("last_rn", commonSearchResult.getMainInfo().rn);
                a2.put("sversion", noa.SERVER_VERSION_VALUE);
            }
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) cVar.getTotalSearchResult();
            if (commonSearchResult2 != null) {
                a2.put(k.a.PARAM_KEY_FIRST_RN, commonSearchResult2.getMainInfo().rn);
            }
            e.a("SrpReviewButton");
            Nav.from(context).toUri(y.a(reviewBean.h5Url, a2));
        }
    }

    private static ArrayMap<String, String> a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("a28fe7fb", new Object[]{cVar, new Integer(i)});
        }
        if (i <= 0) {
            Log.e(f31761a, "review num is invalid");
            return null;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
        if (commonSearchResult == null) {
            Log.e(f31761a, "total result is null");
            return null;
        }
        List<BaseCellBean> cells = commonSearchResult.getCells();
        if (cells == null || cells.size() == 0) {
            Log.e(f31761a, "items is empty");
            return null;
        }
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (BaseCellBean baseCellBean : cells) {
            if (i2 >= i) {
                break;
            }
            String b = b(baseCellBean);
            if (!StringUtils.isEmpty(b)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(b);
                if (a(baseCellBean)) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(b);
                }
                i2++;
            }
        }
        String sb3 = sb.toString();
        if (!StringUtils.isEmpty(sb3)) {
            arrayMap.put("ids", sb3);
        }
        String sb4 = sb2.toString();
        if (!StringUtils.isEmpty(sb4)) {
            arrayMap.put(noa.KEY_P4P_IDS, sb4);
        }
        return arrayMap;
    }

    private static boolean a(BaseCellBean baseCellBean) {
        AuctionBaseBean auctionBaseBean;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd0c273e", new Object[]{baseCellBean})).booleanValue() : (baseCellBean instanceof SFAuctionBaseCellBean) && (auctionBaseBean = ((SFAuctionBaseCellBean) baseCellBean).auctionBaseBean) != null && !StringUtils.isEmpty(auctionBaseBean.p4pUrl);
    }

    private static String b(BaseCellBean baseCellBean) {
        AuctionBaseBean auctionBaseBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47547805", new Object[]{baseCellBean});
        }
        if ((baseCellBean instanceof SFAuctionBaseCellBean) && (auctionBaseBean = ((SFAuctionBaseCellBean) baseCellBean).auctionBaseBean) != null) {
            return auctionBaseBean.itemId;
        }
        if (baseCellBean instanceof M3CellBean) {
            return baseCellBean.itemId;
        }
        if (baseCellBean instanceof MuiseCellBean) {
            return baseCellBean.itemId;
        }
        if (!(baseCellBean instanceof WeexCellBean)) {
            return null;
        }
        return baseCellBean.itemId;
    }
}
