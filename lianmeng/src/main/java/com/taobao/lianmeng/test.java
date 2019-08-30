package com.taobao.lianmeng;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.request.TbkContentGetRequest;
import com.taobao.api.request.TbkDgOptimusMaterialRequest;
import com.taobao.api.request.TbkJuTqgGetRequest;
import com.taobao.api.request.TbkShopGetRequest;
import com.taobao.api.request.TbkUatmFavoritesItemGetRequest;
import com.taobao.api.response.TbkContentGetResponse;
import com.taobao.api.response.TbkDgOptimusMaterialResponse;
import com.taobao.api.response.TbkJuTqgGetResponse;
import com.taobao.api.response.TbkShopGetResponse;
import com.taobao.api.response.TbkUatmFavoritesItemGetResponse;
//145454508L
public class test {
	public static void main(String[] args) {
		TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "27842616", "8eb28c7298c71a835d01ca12bc084568");
		TbkShopGetRequest req = new TbkShopGetRequest();
		req.setFields("user_id,shop_title,shop_type,seller_nick,pict_url,shop_url");
		req.setQ("旗舰店");
		req.setSort("total_auction_des");
		req.setIsTmall(false);
		try {
			TbkShopGetResponse rsp = client.execute(req);
			System.out.println(rsp.getBody());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
