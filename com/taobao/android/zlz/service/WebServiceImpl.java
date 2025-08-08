package com.taobao.android.zlz.service;

import android.app.Activity;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zoloz.hummer.common.BaseWebService;
import com.taobao.android.nav.Nav;
import com.taobao.browser.BrowserActivity;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Stack;

/* loaded from: classes6.dex */
public class WebServiceImpl extends BaseWebService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WebServiceImpl";
    private Stack<String> pageStack = new Stack<>();

    @Override // com.ap.zoloz.hummer.common.BaseWebService
    public void openPage(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("445ee9b3", new Object[]{this, hashMap});
        } else if (hashMap == null || a.a().b() == null || hashMap.get("url") == null || StringUtils.isEmpty(hashMap.get("url").toString())) {
        } else {
            try {
                String obj = hashMap.get("url").toString();
                if (!Nav.from(Globals.getApplication()).toUri(obj)) {
                    return;
                }
                this.pageStack.push(obj);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ap.zoloz.hummer.common.BaseWebService
    public boolean isPageAlreadyExisted(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd5664ec", new Object[]{this, str})).booleanValue() : this.pageStack.contains(str);
    }

    @Override // com.ap.zoloz.hummer.common.BaseWebService
    public void exitPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4ec39e", new Object[]{this, str});
            return;
        }
        Activity activity = (Activity) a.a().b();
        if (activity == null || activity.isFinishing() || !(activity instanceof BrowserActivity)) {
            return;
        }
        BrowserActivity browserActivity = (BrowserActivity) activity;
        Message obtain = Message.obtain(browserActivity.getHandler());
        obtain.what = 88;
        browserActivity.getHandler().sendMessage(obtain);
        this.pageStack.pop();
    }

    @Override // com.ap.zoloz.hummer.common.BaseWebService
    public void exitSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c47c1f", new Object[]{this});
            return;
        }
        Activity activity = (Activity) a.a().b();
        if (activity == null || activity.isFinishing() || !(activity instanceof BrowserActivity)) {
            return;
        }
        while (!this.pageStack.isEmpty()) {
            BrowserActivity browserActivity = (BrowserActivity) activity;
            Message obtain = Message.obtain(browserActivity.getHandler());
            obtain.what = 88;
            browserActivity.getHandler().sendMessage(obtain);
            this.pageStack.pop();
        }
    }
}
