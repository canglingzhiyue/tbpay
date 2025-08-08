package com.alipay.android.msp.network.http;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.framework.dns.DnsValue;
import com.alipay.android.msp.framework.exception.NetErrorException;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.network.http.http.PhoneCashierHttpClient;
import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.plugin.ITransChannel;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspSwitchUtil;
import com.alipay.android.msp.utils.NetParamLogUtil;
import com.alipay.android.msp.utils.NetworkUtils;
import com.alipay.android.msp.utils.Tools;
import com.alipay.android.msp.utils.net.LogicHeaderUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLException;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes3.dex */
public class TransChannel implements ITransChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mHasNetError = false;

    @Override // com.alipay.android.msp.plugin.ITransChannel
    public ResData<byte[]> requestData(ReqData reqData, RequestConfig requestConfig) throws Exception {
        List<Header> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("124352d3", new Object[]{this, reqData, requestConfig});
        }
        if (requestConfig.isBytes()) {
            if (requestConfig.getChannel() == RequestConfig.RequestChannel.BYTES_CASHIER) {
                list = LogicHeaderUtil.generateBytesHeaders(reqData.mMspParam, requestConfig.isSupportGzip());
            } else {
                list = LogicHeaderUtil.generateSecurityHeaders(reqData.mMspParam, requestConfig.isSupportGzip());
            }
        } else if (requestConfig.isDynamicHost()) {
            list = LogicHeaderUtil.generateRequestHeaders(reqData.mMspParam);
        } else {
            list = reqData.mHeaders;
        }
        try {
            return requestData(reqData.toBytesData(), requestConfig.getHttpContentType(), requestConfig.getHost(), list, reqData.mBizId);
        } catch (Throwable th) {
            this.mHasNetError = true;
            throw makeNetErrorException(th);
        }
    }

    private ByteArrayEntity getCompressedEntity(String str, byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayEntity) ipChange.ipc$dispatch("89b4a4ba", new Object[]{this, str, bArr});
        }
        if (StringUtils.isEmpty(str)) {
            str = MspNetConstants.Request.DEFAULT_CONTENT_TYPE;
        }
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(bArr);
        byteArrayEntity.setContentType(str);
        return byteArrayEntity;
    }

    @Override // com.alipay.android.msp.plugin.ITransChannel
    public ResData<byte[]> requestData(byte[] bArr, String str, String str2, List<Header> list, int i) throws IOException, NetErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("7cd30ec7", new Object[]{this, bArr, str, str2, list, new Integer(i)});
        }
        LogUtil.record(2, "TransChannel", "requestData", "bizId: " + i + " contentType: " + str + " url:" + str2);
        PhoneCashierHttpClient newInstance = PhoneCashierHttpClient.newInstance();
        HttpParams params = newInstance.getParams();
        if (this.mHasNetError && NetworkUtils.isMobileWapProxy(GlobalHelper.getInstance().getContext())) {
            params.setParameter("http.route.default-proxy", null);
        } else {
            HttpHost proxy = getProxy(str2);
            if (proxy != null) {
                params.setParameter("http.route.default-proxy", proxy);
            }
        }
        HttpPost httpPost = new HttpPost(str2);
        if (bArr != null && bArr.length > 0) {
            httpPost.setEntity(getCompressedEntity(str, bArr));
        }
        httpPost.addHeader(new BasicHeader("host", getHost(str2)));
        if (list != null) {
            for (Header header : list) {
                httpPost.addHeader(header);
            }
        }
        HttpResponse execute = newInstance.execute(httpPost, i);
        NetParamLogUtil.httpReqLogPrint(httpPost);
        byte[] stringFromHttpResponse = getStringFromHttpResponse(i, execute);
        List<Header> buildResHeaders = buildResHeaders(execute.getAllHeaders());
        ResData<byte[]> resData = new ResData<>(stringFromHttpResponse);
        resData.mHeaders = buildResHeaders;
        resData.mStatusCode = execute.getStatusLine().getStatusCode();
        return resData;
    }

    private List<Header> buildResHeaders(Header[] headerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bf3a883c", new Object[]{this, headerArr});
        }
        ArrayList arrayList = new ArrayList();
        Header findHeader = findHeader("msp-gzip", headerArr);
        if (findHeader != null) {
            arrayList.add(findHeader);
        }
        Header findHeader2 = findHeader(MspNetConstants.Request.MSP_PARAM, headerArr);
        if (findHeader2 != null) {
            arrayList.add(findHeader2);
        }
        Header findHeader3 = findHeader("msp-bytes", headerArr);
        if (findHeader3 != null) {
            MspSwitchUtil.setMspBytes(findHeader3.getValue());
        }
        return arrayList;
    }

    private String getHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("500f2a51", new Object[]{this, str});
        }
        try {
            return new URI(str).getAuthority();
        } catch (URISyntaxException e) {
            LogUtil.printExceptionStackTrace(e);
            return DnsValue.DOMAIN_MOBILE_GW;
        }
    }

    private Header findHeader(String str, Header[] headerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Header) ipChange.ipc$dispatch("55b45db8", new Object[]{this, str, headerArr});
        }
        if (headerArr == null || headerArr.length <= 0 || StringUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        for (Header header : headerArr) {
            String name = header.getName();
            if (!StringUtils.isEmpty(name) && StringUtils.equals(name.toLowerCase(), lowerCase)) {
                return header;
            }
        }
        return null;
    }

    private HttpHost getProxy(String str) throws MalformedURLException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpHost) ipChange.ipc$dispatch("a9ebf89b", new Object[]{this, str}) : getProxy11(str);
    }

    private HttpHost getProxy11(String str) throws MalformedURLException {
        String property;
        String property2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("90727c7b", new Object[]{this, str});
        }
        String activeNetworkType = Tools.getActiveNetworkType();
        if (activeNetworkType != null && !activeNetworkType.contains("wap")) {
            return null;
        }
        if ("https".equalsIgnoreCase(new URL(str).getProtocol())) {
            property = System.getProperty("https.proxyHost");
            property2 = System.getProperty("https.proxyPort");
        } else {
            property = System.getProperty("http.proxyHost");
            property2 = System.getProperty("http.proxyPort");
        }
        if (StringUtils.isEmpty(property)) {
            return null;
        }
        return new HttpHost(property, Integer.parseInt(property2));
    }

    @Override // com.alipay.android.msp.plugin.ITransChannel
    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        } else {
            PhoneCashierHttpClient.newInstance().shutdown();
        }
    }

    private static NetErrorException makeNetErrorException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetErrorException) ipChange.ipc$dispatch("11760f96", new Object[]{th});
        }
        NetErrorException netErrorException = new NetErrorException(th);
        netErrorException.setChannel(NetErrorException.Channel.HTTP);
        if (th instanceof HttpHostConnectException) {
            netErrorException.setStatErrorCode(107);
        } else if (th instanceof ConnectTimeoutException) {
            netErrorException.setStatErrorCode(103);
        } else if (th instanceof SocketTimeoutException) {
            netErrorException.setStatErrorCode(104);
        } else if (th instanceof SocketException) {
            netErrorException.setStatErrorCode(105);
        } else if (th instanceof SSLException) {
            netErrorException.setStatErrorCode(108);
        } else if (th instanceof UnknownHostException) {
            netErrorException.setStatErrorCode(111);
        } else if (th instanceof IOException) {
            netErrorException.setStatErrorCode(109);
        } else {
            netErrorException.setStatErrorCode(106);
        }
        return netErrorException;
    }

    public static byte[] getStringFromHttpResponse(int i, HttpResponse httpResponse) throws NetErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b24ff9c6", new Object[]{new Integer(i), httpResponse});
        }
        StatusLine statusLine = httpResponse.getStatusLine();
        int statusCode = statusLine.getStatusCode();
        InputStream inputStream = null;
        try {
            try {
                InputStream content = httpResponse.getEntity().getContent();
                if (statusLine.getStatusCode() != 200 || content == null) {
                    NetErrorException netErrorException = new NetErrorException(statusCode + " " + statusLine.getReasonPhrase());
                    netErrorException.setStatErrorCode(102);
                    throw netErrorException;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = content.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                try {
                    content.close();
                } catch (Exception unused) {
                }
                return byteArray;
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
                NetErrorException netErrorException2 = new NetErrorException(e);
                netErrorException2.setStatErrorCode(101);
                throw netErrorException2;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }
}
