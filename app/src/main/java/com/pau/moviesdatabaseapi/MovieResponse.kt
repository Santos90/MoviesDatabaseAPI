package com.pau.moviesdatabaseapi

import com.google.gson.annotations.SerializedName
data class MovieListResponse(
    val result: List<MovieResponse>
)

data class MovieResponse(
    val primaryImage : PrimaryImage,
    val originalTitleText: OriginalTitleText
)

data class PrimaryImage(
    val url : String
)

data class OriginalTitleText(
    val text : String
)


/*
{
  "entries": 10,
  "results": [
    {
      "_id": "61e5d514d8f3c0931e558eb1",
      "id": "tt9789660",
      "primaryImage": {
        "id": "rm750561537",
        "width": 648,
        "height": 960,
        "url": "https://m.media-amazon.com/images/M/MV5BNzRkNjllZjktZTkwZC00YTgxLTlmMWEtZWYzYzUwODQ0NzZiXkEyXkFqcGdeQXVyMjQ3MjU3NTU@._V1_.jpg",
        "caption": {
          "plainText": "Transformers: War for Cybertron (2020)",
          "__typename": "Markdown"
        },
        "__typename": "Image"
      },
      "titleType": {
        "text": "TV Series",
        "id": "tvSeries",
        "isSeries": true,
        "isEpisode": false,
        "__typename": "TitleType"
      },
      "titleText": {
        "text": "Transformers: War for Cybertron",
        "__typename": "TitleText"
      },
      "originalTitleText": {
        "text": "Transformers: War for Cybertron",
        "__typename": "TitleText"
      },
      "releaseYear": {
        "year": 2020,
        "endYear": 2021,
        "__typename": "YearRange"
      },
      "releaseDate": {
        "day": 30,
        "month": 7,
        "year": 2020,
        "__typename": "ReleaseDate"
      },
      "position": 5125
    },
    {
      "_id": "61e5d22ed8f3c0931e54d63d",
      "id": "tt9581768",
      "primaryImage": {
        "id": "rm65454337",
        "width": 1482,
        "height": 2222,
        "url": "https://m.media-amazon.com/images/M/MV5BYTJhM2E1MDQtYWY2ZS00Zjk1LWI5OTMtMjE0MjcyY2M4YzI2XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg",
        "caption": {
          "plainText": "The Circle (2020)",
          "__typename": "Markdown"
        },
        "__typename": "Image"
      },
      "titleType": {
        "text": "TV Series",
        "id": "tvSeries",
        "isSeries": true,
        "isEpisode": false,
        "__typename": "TitleType"
      },
      "titleText": {
        "text": "The Circle",
        "__typename": "TitleText"
      },
      "originalTitleText": {
        "text": "The Circle",
        "__typename": "TitleText"
      },
      "releaseYear": {
        "year": 2020,
        "endYear": null,
        "__typename": "YearRange"
      },
      "releaseDate": {
        "day": 1,
        "month": 1,
        "year": 2020,
        "__typename": "ReleaseDate"
      },
      "position": 3846
    },
    {
      "_id": "61e5ca80cffb8f2faa5301a3",
      "id": "tt9731288",
      "primaryImage": {
        "id": "rm3780882689",
        "width": 426,
        "height": 597,
        "url": "https://m.media-amazon.com/images/M/MV5BMjc4M2YyZGQtZGRmYi00NjEwLWJjMjAtOTQ4MGYxNzdhZmE2XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg",
        "caption": {
          "plainText": "Diana Gómez, Silma López, Teresa Riott, and Paula Malia in Valeria (2020)",
          "__typename": "Markdown"
        },
        "__typename": "Image"
      },
      "titleType": {
        "text": "TV Series",
        "id": "tvSeries",
        "isSeries": true,
        "isEpisode": false,
        "__typename": "TitleType"
      },
      "titleText": {
        "text": "Valeria",
        "__typename": "TitleText"
      },
      "originalTitleText": {
        "text": "Valeria",
        "__typename": "TitleText"
      },
      "releaseYear": {
        "year": 2020,
        "endYear": null,
        "__typename": "YearRange"
      },
      "releaseDate": {
        "day": 8,
        "month": 5,
        "year": 2020,
        "__typename": "ReleaseDate"
      },
      "position": 1592
    },
    {
      "_id": "61ed9424d986bb3eceee9320",
      "id": "tt11905720",
      "primaryImage": {
        "id": "rm3400318465",
        "width": 1125,
        "height": 1666,
        "url": "https://m.media-amazon.com/images/M/MV5BYzc4ZmFhZjItOWJjMy00YzhiLTkxMDAtNWUyNjIyOTJkYmY3XkEyXkFqcGdeQXVyNDAzNDk0MTQ@._V1_.jpg",
        "caption": {
          "plainText": "Vijay Varma and Aditi Sudhir Pohankar in She (2020)",
          "__typename": "Markdown"
        },
        "__typename": "Image"
      },
      "titleType": {
        "text": "TV Series",
        "id": "tvSeries",
        "isSeries": true,
        "isEpisode": false,
        "__typename": "TitleType"
      },
      "titleText": {
        "text": "She",
        "__typename": "TitleText"
      },
      "originalTitleText": {
        "text": "She",
        "__typename": "TitleText"
      },
      "releaseYear": {
        "year": 2020,
        "endYear": null,
        "__typename": "YearRange"
      },
      "releaseDate": {
        "day": 20,
        "month": 3,
        "year": 2020,
        "__typename": "ReleaseDate"
      },
      "position": 5324
    },
    {
      "_id": "61e5991295801a78bc470123",
      "id": "tt12357958",
      "primaryImage": {
        "id": "rm609331969",
        "width": 1080,
        "height": 1594,
        "url": "https://m.media-amazon.com/images/M/MV5BZDBkNWNjZTctMGI2My00MDQ5LWI5ODAtY2I1Y2ZjOThiY2VhXkEyXkFqcGdeQXVyOTE4NzcwNzI@._V1_.jpg",
        "caption": {
          "plainText": "Ni shi wo de ming zhong zhu ding (2020)",
          "__typename": "Markdown"
        },
        "__typename": "Image"
      },
      "titleType": {
        "text": "TV Series",
        "id": "tvSeries",
        "isSeries": true,
        "isEpisode": false,
        "__typename": "TitleType"
      },
      "titleText": {
        "text": "Ni shi wo de ming zhong zhu ding",
        "__typename": "TitleText"
      },
      "originalTitleText": {
        "text": "Ni shi wo de ming zhong zhu ding",
        "__typename": "TitleText"
      },
      "releaseYear": {
        "year": 2020,
        "endYear": null,
        "__typename": "YearRange"
      },
      "releaseDate": {
        "day": 5,
        "month": 6,
        "year": 2020,
        "__typename": "ReleaseDate"
      },
      "position": 9023
    },
    {
      "_id": "61e5937e78c012aa34459b37",
      "id": "tt11398870",
      "primaryImage": {
        "id": "rm4281056769",
        "width": 426,
        "height": 597,
        "url": "https://m.media-amazon.com/images/M/MV5BYWVhY2NmMTUtNDE5Zi00NGFjLTlkZjEtZjQ5ZTM1MWI0ZDkzXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg",
        "caption": {
          "plainText": "Kalifat (2020)",
          "__typename": "Markdown"
        },
        "__typename": "Image"
      },
      "titleType": {
        "text": "TV Series",
        "id": "tvSeries",
        "isSeries": true,
        "isEpisode": false,
        "__typename": "TitleType"
      },
      "titleText": {
        "text": "Kalifat",
        "__typename": "TitleText"
      },
      "originalTitleText": {
        "text": "Kalifat",
        "__typename": "TitleText"
      },
      "releaseYear": {
        "year": 2020,
        "endYear": null,
        "__typename": "YearRange"
      },
      "releaseDate": {
        "day": 18,
        "month": 3,
        "year": 2020,
        "__typename": "ReleaseDate"
      },
      "position": 1017
    },
    {
      "_id": "61e5ce45d8f3c0931e53e2d3",
      "id": "tt9139220",
      "primaryImage": {
        "id": "rm1483375361",
        "width": 800,
        "height": 1000,
        "url": "https://m.media-amazon.com/images/M/MV5BNTBmNzM4ZGMtMTE3OC00Mjc4LWE3OGEtYzA3ZmQ1MGJkNjMyXkEyXkFqcGdeQXVyNDk3ODk4OQ@@._V1_.jpg",
        "caption": {
          "plainText": "Claes Bang in Dracula (2020)",
          "__typename": "Markdown"
        },
        "__typename": "Image"
      },
      "titleType": {
        "text": "TV Mini Series",
        "id": "tvMiniSeries",
        "isSeries": true,
        "isEpisode": false,
        "__typename": "TitleType"
      },
      "titleText": {
        "text": "Dracula",
        "__typename": "TitleText"
      },
      "originalTitleText": {
        "text": "Dracula",
        "__typename": "TitleText"
      },
      "releaseYear": {
        "year": 2020,
        "endYear": 2020,
        "__typename": "YearRange"
      },
      "releaseDate": {
        "day": 4,
        "month": 1,
        "year": 2020,
        "__typename": "ReleaseDate"
      },
      "position": 730
    },
    {
      "_id": "61e58d1f78c012aa34440e67",
      "id": "tt10327294",
      "primaryImage": {
        "id": "rm3593832193",
        "width": 2000,
        "height": 3000,
        "url": "https://m.media-amazon.com/images/M/MV5BZTQ1NmU1NjYtYzc3NC00NDRhLTg0ZDAtOGI1OWYyZTcxNzBlXkEyXkFqcGdeQXVyMzQ2MDI5NjU@._V1_.jpg",
        "caption": {
          "plainText": "Outmatched (2020)",
          "__typename": "Markdown"
        },
        "__typename": "Image"
      },
      "titleType": {
        "text": "TV Series",
        "id": "tvSeries",
        "isSeries": true,
        "isEpisode": false,
        "__typename": "TitleType"
      },
      "titleText": {
        "text": "Outmatched",
        "__typename": "TitleText"
      },
      "originalTitleText": {
        "text": "Outmatched",
        "__typename": "TitleText"
      },
      "releaseYear": {
        "year": 2020,
        "endYear": 2020,
        "__typename": "YearRange"
      },
      "releaseDate": {
        "day": 23,
        "month": 1,
        "year": 2020,
        "__typename": "ReleaseDate"
      },
      "position": 5353
    },
    {
      "_id": "61e5967f95801a78bc465d05",
      "id": "tt11910134",
      "primaryImage": {
        "id": "rm3922245889",
        "width": 800,
        "height": 1200,
        "url": "https://m.media-amazon.com/images/M/MV5BMzMxZTc3Y2UtMTdmMi00ZDlhLTgyYWQtMmVhMzlkNTM2N2NmXkEyXkFqcGdeQXVyNjQwNDMxNTk@._V1_.jpg",
        "caption": {
          "plainText": "Moon Sung-Keun, Park Hoon, Hae-hyo Kwon, Cheol-min Park, Ji-ho Ahn, Kim Seo-hyeong, Jang Young-Nam, Deok-Hwan Ryu, Soo-Jang Baek, Jo Han-chul, Chan-Young Yoon, Jin-Woong Min, and Seok-Chan Jeon in Nobody Knows (2020)",
          "__typename": "Markdown"
        },
        "__typename": "Image"
      },
      "titleType": {
        "text": "TV Series",
        "id": "tvSeries",
        "isSeries": true,
        "isEpisode": false,
        "__typename": "TitleType"
      },
      "titleText": {
        "text": "Nobody Knows",
        "__typename": "TitleText"
      },
      "originalTitleText": {
        "text": "Nobody Knows",
        "__typename": "TitleText"
      },
      "releaseYear": {
        "year": 2020,
        "endYear": 2020,
        "__typename": "YearRange"
      },
      "releaseDate": {
        "day": 2,
        "month": 3,
        "year": 2020,
        "__typename": "ReleaseDate"
      },
      "position": 9338
    },
    {
      "_id": "61e58d81d8f3c0931e4427e7",
      "id": "tt10394778",
      "primaryImage": {
        "id": "rm2046475009",
        "width": 521,
        "height": 755,
        "url": "https://m.media-amazon.com/images/M/MV5BMGZhOTQ1YmEtODI4NC00MjdkLWFmNjktODIxMzk3OGUwMTk0XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg",
        "caption": {
          "plainText": "Vagrant Queen (2020)",
          "__typename": "Markdown"
        },
        "__typename": "Image"
      },
      "titleType": {
        "text": "TV Series",
        "id": "tvSeries",
        "isSeries": true,
        "isEpisode": false,
        "__typename": "TitleType"
      },
      "titleText": {
        "text": "Vagrant Queen",
        "__typename": "TitleText"
      },
      "originalTitleText": {
        "text": "Vagrant Queen",
        "__typename": "TitleText"
      },
      "releaseYear": {
        "year": 2020,
        "endYear": 2020,
        "__typename": "YearRange"
      },
      "releaseDate": {
        "day": 27,
        "month": 3,
        "year": 2020,
        "__typename": "ReleaseDate"
      },
      "position": 8159
    }
  ]
}
 */
