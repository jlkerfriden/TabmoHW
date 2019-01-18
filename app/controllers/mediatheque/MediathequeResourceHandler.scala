package controllers.mediatheque

import javax.inject.{Inject, Singleton}
import models.Movie

import scala.collection.mutable.ListBuffer
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class MediathequeResourceHandler @Inject()()(implicit ec: ExecutionContext) {

  val movies: ListBuffer[Movie] = ListBuffer(
    Movie("The first movie", "PYF", 2019, None, None, None, List("SF"), 5)
  )

  def list(): Future[ListBuffer[Movie]] = {
    Future {
      movies
    }
  }

  def create(movie: Movie): Unit = {
    movies += movie
  }
}