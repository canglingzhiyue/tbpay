package com.taobao.share.multiapp;

import java.io.Serializable;
import tb.nzg;
import tb.nzh;
import tb.nzi;
import tb.nzk;
import tb.nzl;
import tb.nzm;
import tb.nzo;

/* loaded from: classes8.dex */
public interface IShareBiz extends Serializable {
    nzg getAppEnv();

    nzh getContactsInfoProvider();

    nzi getFriendsProvider();

    nzk getLogin();

    nzl getOrangeDefaultValueHelper();

    nzo getShareBackWeexSdk(String str);

    nzm getShareChannel();

    nzo getShareWeexSdk();

    nzo getShareWeexSdk(String str);

    void initShareMenu();
}
