package com.taobao.android.tschedule.parser;

import android.content.Intent;
import android.net.Uri;
import com.taobao.android.tschedule.parser.expr.edition.EditionInfo;
import com.taobao.android.tschedule.parser.expr.location.LocationInfo;
import com.taobao.android.tschedule.parser.expr.login.LoginInfo;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class ExprParserParams implements Serializable {
    public List<String> blacklist;
    public EditionInfo edition;
    public Map ext;
    public Intent intent;
    public LocationInfo location;
    public LoginInfo login;
    public String targetUrl;
    public List<TimeContent> timeContent;
    public Uri uri;

    static {
        kge.a(360647091);
        kge.a(1028243835);
    }

    public ExprParserParams(String str, List<String> list, Intent intent) {
        this.targetUrl = str;
        this.blacklist = list;
        this.intent = intent;
    }

    public ExprParserParams(String str, List<String> list, Intent intent, List<TimeContent> list2) {
        this.targetUrl = str;
        this.blacklist = list;
        this.intent = intent;
        this.timeContent = list2;
    }
}
