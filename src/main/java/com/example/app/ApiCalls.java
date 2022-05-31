package com.example.app;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@SuppressWarnings("unused")
public class ApiCalls {
	//API Call to get leagues of the different games
		public String newsGlance() throws IOException, InterruptedException
		{
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://bing-news-search1.p.rapidapi.com/news/trendingtopics?cc=IN&textFormat=Raw&safeSearch=Off"))
					.header("x-bingapis-sdk", "true")
					.header("x-rapidapi-key", "e0bdefd8acmsh5fe9b403c8f588ep14d5c3jsnb547865f5b62")
					.header("x-rapidapi-host", "bing-news-search1.p.rapidapi.com")
					.method("GET", HttpRequest.BodyPublishers.noBody())
					.build();
			HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());
			return response.body();
		}
		
		
		//API Call to get News of the different games
		public String news() throws IOException, InterruptedException
		{
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://bing-news-search1.p.rapidapi.com/news?safeSearch=Off&textFormat=Raw"))
					.header("x-bingapis-sdk", "true")
					.header("x-rapidapi-key", "e0bdefd8acmsh5fe9b403c8f588ep14d5c3jsnb547865f5b62")
					.header("x-rapidapi-host", "bing-news-search1.p.rapidapi.com")
					.method("GET", HttpRequest.BodyPublishers.noBody())
					.build();
			HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());
			return response.body();
		}
		
		
		
		//API Call to get live matches of the different games
		public String srch(String str) throws IOException, InterruptedException
		{
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://bing-news-search1.p.rapidapi.com/news/search?q=inbody%3A"+str+"%20OR%20intitle%3A"+str+"&freshness=Day&textFormat=Raw&safeSearch=Off"))
					.header("x-bingapis-sdk", "true")
					.header("x-rapidapi-key", "e0bdefd8acmsh5fe9b403c8f588ep14d5c3jsnb547865f5b62")
					.header("x-rapidapi-host", "bing-news-search1.p.rapidapi.com")
					.method("GET", HttpRequest.BodyPublishers.noBody())
					.build();
			HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());
			return response.body();
		}
}
