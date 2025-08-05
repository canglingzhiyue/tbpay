package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.pop.bean.MTBIconLocalIndexProtocol;
import com.taobao.mytaobao.pop.bean.MTBIconPixelInfoBean;

/* loaded from: classes7.dex */
public class mvs implements mvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1654583221);
        kge.a(1535632036);
    }

    @Override // tb.mvr
    public MTBIconLocalIndexProtocol a(String str) {
        MTBIconLocalIndexProtocol mTBIconLocalIndexProtocol;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBIconLocalIndexProtocol) ipChange.ipc$dispatch("566711df", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            mTBIconLocalIndexProtocol = (MTBIconLocalIndexProtocol) JSONObject.parseObject(str, MTBIconLocalIndexProtocol.class);
        } catch (Exception unused) {
            mTBIconLocalIndexProtocol = null;
        }
        if (mTBIconLocalIndexProtocol != null && !TextUtils.isEmpty(mTBIconLocalIndexProtocol.moduleTag)) {
            return mTBIconLocalIndexProtocol;
        }
        return null;
    }

    @Override // tb.mvr
    public MTBIconPixelInfoBean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBIconPixelInfoBean) ipChange.ipc$dispatch("670e784c", new Object[]{this, view});
        }
        MTBIconPixelInfoBean mTBIconPixelInfoBean = new MTBIconPixelInfoBean();
        mTBIconPixelInfoBean.setFindIcon(true);
        mTBIconPixelInfoBean.setIconShow(true);
        a(view, mTBIconPixelInfoBean);
        b(view, mTBIconPixelInfoBean);
        a(mTBIconPixelInfoBean);
        return mTBIconPixelInfoBean;
    }

    private void a(View view, MTBIconPixelInfoBean mTBIconPixelInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9c3848", new Object[]{this, view, mTBIconPixelInfoBean});
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        mTBIconPixelInfoBean.setX(iArr[0]);
        mTBIconPixelInfoBean.setY(iArr[1]);
    }

    private void b(View view, MTBIconPixelInfoBean mTBIconPixelInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("234a6309", new Object[]{this, view, mTBIconPixelInfoBean});
            return;
        }
        int height = view.getHeight();
        int width = view.getWidth();
        mTBIconPixelInfoBean.setIconHeight(height);
        mTBIconPixelInfoBean.setIconWidth(width);
    }

    private void a(MTBIconPixelInfoBean mTBIconPixelInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ddda8a", new Object[]{this, mTBIconPixelInfoBean});
            return;
        }
        mTBIconPixelInfoBean.setCenterX(mTBIconPixelInfoBean.getX() + (mTBIconPixelInfoBean.getIconWidth() / 2.0f));
        mTBIconPixelInfoBean.setCenterY(mTBIconPixelInfoBean.getY() + (mTBIconPixelInfoBean.getIconHeight() / 2.0f));
    }
}
