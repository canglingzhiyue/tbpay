package anet.channel.assist.stat;

import anet.channel.statist.Dimension;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;

@Monitor(module = "networkPrefer", monitorPoint = "assist_register")
/* loaded from: classes2.dex */
public class RegisterStat extends StatObject {
    public static final int ERROR_CODE_GET_CAPABILITY = -3;
    public static final int ERROR_CODE_NOT_SUPPORT = -1;
    public static final int ERROR_CODE_REGISTER = -2;
    @Dimension
    public String capabilities;
    @Dimension
    public int enable;
    @Dimension
    public int errorCode;
    @Dimension
    public String operator;

    public RegisterStat(String str) {
        this.operator = str;
    }
}
